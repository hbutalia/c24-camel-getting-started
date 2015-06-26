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

import javax.sql.DataSource;

@TestPropertySource(properties = { "outbound.jdbc.poller.fixed.rate = 1000"})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class OutboundJDBCPollerTest extends CamelSpringTestSupport {

    private JdbcTemplate jdbcTemplate;


    @Before
    public void setupDatabase() throws Exception {
        DataSource dataSource = context.getRegistry().findByType(DataSource.class).iterator().next();
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute(TestUtils.readFileAsString(TestUtils.locateClasspathResource("/data/scripts/order-insert.sql")));
    }

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("application-context.xml");
    }

    @Test
    public void validPoll() throws Exception {

        configureMockEndpoint();
        MockEndpoint mockEndpoint = getMockEndpoint("mock:catchProcessedMessages");
        mockEndpoint.expectedMessageCount(1);
        context.start();
        assertMockEndpointsSatisfied();
        context.stop();
    }

    private void configureMockEndpoint() throws Exception {
        context.getRouteDefinition("outboundJdbcPollerRoute").adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                interceptSendToEndpoint("direct:outboundMessageHandling")
                        .skipSendToOriginalEndpoint()
                        .to("mock:catchProcessedMessages");
            }
        });
    }
}
