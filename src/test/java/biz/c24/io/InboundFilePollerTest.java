package biz.c24.io;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptorAdapter;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static biz.c24.io.TestUtils.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class InboundFilePollerTest extends CamelSpringTestSupport {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    private File inboundReadDirectory;
    private File inboundProcessedDirectory;
    private File inboundFailedDirectory;


    @Override
    public void doPreSetup() throws Exception {
        super.doPreSetup();
        inboundReadDirectory = temporaryFolder.newFolder("in");
        inboundProcessedDirectory = temporaryFolder.newFolder("processed");
        inboundFailedDirectory = temporaryFolder.newFolder("failed");
    }



    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("application-context.xml");
    }

    @Test
    public void pollFindsValidFile() throws Exception {
        MockEndpoint mockEndpoint = getMockEndpoint();
        mockEndpoint.expectedMessageCount(1);
        FileCopyUtils.copy(locateClasspathResource(INBOUND_FILE), new File(inboundReadDirectory, INBOUND_FILE_NAME));
        mockEndpoint.assertIsSatisfied();
        assertThatDirectoryIsEmpty(inboundReadDirectory);
        assertThatDirectoryHasFiles(inboundProcessedDirectory, 1);
        assertThatDirectoryIsEmpty(inboundFailedDirectory);

    }


    @Test
    public void pollIgnoresFileAlreadySeen() throws Exception {
        MockEndpoint mockEndpoint = getMockEndpoint();
        mockEndpoint.expectedMessageCount(1);
        FileCopyUtils.copy(locateClasspathResource(INBOUND_FILE), new File(inboundReadDirectory, INBOUND_FILE_NAME));
        mockEndpoint.assertIsSatisfied();
        assertThatDirectoryIsEmpty(inboundReadDirectory);
        assertThatDirectoryHasFiles(inboundProcessedDirectory, 1);
        assertThatDirectoryIsEmpty(inboundFailedDirectory);
        //put file with same name in directory
        mockEndpoint.reset();
        mockEndpoint.expectedMessageCount(0);
        FileCopyUtils.copy(locateClasspathResource(INBOUND_FILE), new File(inboundReadDirectory, INBOUND_FILE_NAME));
        mockEndpoint.assertIsSatisfied(2000);
        assertThatDirectoryHasFiles(inboundReadDirectory, 1);
        assertThatDirectoryHasFiles(inboundProcessedDirectory, 1);
        assertThatDirectoryIsEmpty(inboundFailedDirectory);
    }

    @Test
    public void rollbackDeletesFile() throws Exception {
        context.getRouteDefinition("inboundFilePollingRoute").adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                replaceFromWith("file://" + inboundReadDirectory.getAbsolutePath() + "?delay=100&idempotent=true&move=" + inboundProcessedDirectory.getAbsolutePath() + "&moveFailed=" + inboundFailedDirectory.getAbsolutePath());
                interceptSendToEndpoint("direct:inboundMessageHandling")
                        .skipSendToOriginalEndpoint()
                        .throwException(new RuntimeException("File should be moved to Failed"));

            }
        });
        FileCopyUtils.copy(TestUtils.locateClasspathResource(INBOUND_FILE), new File(inboundReadDirectory, INBOUND_FILE_NAME));
        assertThatDirectoryHasFiles(inboundFailedDirectory, 1);
        assertThatDirectoryIsEmpty(inboundProcessedDirectory);
        assertThatDirectoryIsEmpty(inboundReadDirectory);
    }

    private MockEndpoint getMockEndpoint() throws Exception {
        MockEndpoint mockEndpoint = getMockEndpoint("mock:catchProcessedMessages");
        context.getRouteDefinition("inboundFilePollingRoute").adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() throws Exception {
                replaceFromWith("file://" + inboundReadDirectory.getAbsolutePath() + "?delay=100&idempotent=true&move=" + inboundProcessedDirectory.getAbsolutePath());
                interceptSendToEndpoint("direct:inboundMessageHandling")
                        .skipSendToOriginalEndpoint()
                        .to("mock:catchProcessedMessages");

            }
        });
        return mockEndpoint;
    }
}
