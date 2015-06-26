package biz.c24.io;


import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

import javax.sql.DataSource;

import static org.hamcrest.Matchers.is;

@TestPropertySource(properties = { "outbound.jdbc.poller.fixed.rate = 1000"})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class OutboundRouteTest extends CamelSpringTestSupport {

    private JdbcTemplate jdbcTemplate;

    private String orderProcessedCountSql = "select count(*) from purchase_order where Processed = 1";

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("application-context.xml");
    }

    @Before
    public void setupDatabase() throws Exception {
        DataSource dataSource = context.getRegistry().findByType(DataSource.class).iterator().next();
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute(TestUtils.readFileAsString(TestUtils.locateClasspathResource("/data/scripts/order-insert.sql")));
    }

    @Test
    public void validPoll() throws Exception {
        MockEndpoint fileEndpoint = getMockEndpoint("mock:catchProcessedMessages");
        fileEndpoint.expectedMessageCount(1);
        configureWriteEndpoint();
        Integer count = jdbcTemplate.queryForObject(orderProcessedCountSql, Integer.class);
        assertThat(count, is(0));
        context.start();
        fileEndpoint.assertIsSatisfied();
        assertProcessedCount(1);
        context.stop();
    }

    private void configureWriteEndpoint() throws Exception {
        context.getRouteDefinition("outboundMessageWriteRoute").adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                interceptSendToEndpoint("file://outbound/archive*")
                        .skipSendToOriginalEndpoint()
                        .to("mock:catchProcessedMessages");
            }
        });
    }

    public void assertProcessedCount(int expectedCount) throws Exception {
        int counter = 0;
        int count = 0;
        while (count < expectedCount && counter++ <=10) {
            Thread.sleep(500);
            count = jdbcTemplate.queryForObject(orderProcessedCountSql, Integer.class);
        }
        assertThat(count, is(expectedCount));
    }
}
