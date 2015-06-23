package biz.c24.io;

import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;

import javax.sql.DataSource;
import java.io.File;
import java.net.ConnectException;
import java.util.Properties;

import static biz.c24.io.TestUtils.*;
import static org.hamcrest.Matchers.is;

@DirtiesContext
@Transactional
public class InboundRouteTest extends CamelSpringTestSupport {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    private File inboundReadDirectory;
    private File inboundProcessedDirectory;
    private File inboundFailedDirectory;
    private File inboundWriteDirectory;


    @Override
    public void doPreSetup() throws Exception {
        super.doPreSetup();
        inboundReadDirectory = temporaryFolder.newFolder("in");
        inboundProcessedDirectory = temporaryFolder.newFolder("processed");
        inboundFailedDirectory = temporaryFolder.newFolder("failed");
        inboundWriteDirectory = temporaryFolder.newFolder("out");
    }

    private String orderCountSql = "select count(*) from purchase_order";

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("application-context.xml");
    }

    @Test
    public void validMessage() throws Exception {
        MockEndpoint fileEndpoint = getMockEndpoint("mock:catchProcessedMessages");
        fileEndpoint.expectedMessageCount(3);
        configureReadEndpoint();
        configureWriteEndpoint();
        context.start();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(context.getRegistry().findByType(DataSource.class).iterator().next());
        Integer count = jdbcTemplate.queryForObject(orderCountSql, Integer.class);
        assertThat(count, is(0));
        FileCopyUtils.copy(locateClasspathResource(INBOUND_FILE), new File(inboundReadDirectory.getAbsolutePath(), INBOUND_FILE_NAME));
        fileEndpoint.assertIsSatisfied();
        assertThatDirectoryIsEmpty(inboundFailedDirectory);
        assertThatDirectoryIsEmpty(inboundReadDirectory);
        assertThatDirectoryHasFiles(inboundProcessedDirectory, 1);
        count = jdbcTemplate.queryForObject(orderCountSql, Integer.class);
        assertThat(count, is(3));
        context.stop();
    }

    @Test
    public void parseFailure() throws Exception {
        configureReadEndpoint();
        context.start();
        FileCopyUtils.copy(locateClasspathResource(PARSE_FAIL_FILE), new File(inboundReadDirectory.getAbsolutePath(), INBOUND_FILE_NAME));
        assertThatDirectoryIsEmpty(inboundProcessedDirectory);
        assertThatDirectoryIsEmpty(inboundReadDirectory);
        assertThatDirectoryHasFiles(inboundFailedDirectory, 1);
        context.stop();
    }

    @Test
    public void databaseConnectionFailure() throws Exception {
        MockEndpoint fileEndpoint = getMockEndpoint("mock:catchProcessedMessages");
        fileEndpoint.expectedMessageCount(3);
        RouteBuilder routeBuilder = configureDatabaseException();
        context.getRouteDefinition("inboundMessagePersistenceRoute").adviceWith(context, routeBuilder);
        context.start();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(context.getRegistry().findByType(DataSource.class).iterator().next());
        Integer count = jdbcTemplate.queryForObject(orderCountSql, Integer.class);
        assertThat(count, is(0));
        FileCopyUtils.copy(locateClasspathResource(INBOUND_FILE), new File(inboundReadDirectory.getAbsolutePath(), INBOUND_FILE_NAME));
        fileEndpoint.assertIsNotSatisfied(5000);
        count = jdbcTemplate.queryForObject(orderCountSql, Integer.class);
        assertThat(count, is(0));
        context.stop();

    }


    private void configureWriteEndpoint() throws Exception {
        context.getRouteDefinition("inboundMessageWriteRoute").adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                interceptSendToEndpoint("file://inbound/out*")
                        .skipSendToOriginalEndpoint()
                        .to("mock:catchProcessedMessages");
            }
        });
    }

    private void configureReadEndpoint() throws Exception {
        context.getRouteDefinition("inboundFilePollingRoute").adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                replaceFromWith("file://" + inboundReadDirectory.getAbsolutePath() + "?delay=100&idempotent=true&move=" + inboundProcessedDirectory.getAbsolutePath() + "&moveFailed=" + inboundFailedDirectory.getAbsolutePath());
            }
        });
    }

    private RouteBuilder configureDatabaseException() {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                interceptSendToEndpoint("bean:orderService*")
                        .throwException(new ConnectException("Connection failed"));

            }
        };
    }

}
