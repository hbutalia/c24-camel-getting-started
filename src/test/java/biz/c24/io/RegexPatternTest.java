package biz.c24.io;

import biz.c24.io.configuration.PropertiesConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@ContextConfiguration(classes = PropertiesConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RegexPatternTest {

    @Value("${inbound.filename.regex}")
    String inboundFileNamePattern;


    @Test
    public void patternMatchingOnInboundFileRegexProperty() {
        assertThat("foo.xml".matches(inboundFileNamePattern), is(true));
        assertThat("purchase-order.xml".matches(inboundFileNamePattern), is(true));
        assertThat("foo.csv".matches(inboundFileNamePattern), is(true));
        assertThat("foo.txt".matches(inboundFileNamePattern), is(true));
        assertThat("foo.tmp".matches(inboundFileNamePattern), is(false));

    }

}
