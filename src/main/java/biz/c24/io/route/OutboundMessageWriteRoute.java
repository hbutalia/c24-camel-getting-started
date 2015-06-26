package biz.c24.io.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class OutboundMessageWriteRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:outboundMessageWrite")
                .routeId("outboundMessageWriteRoute")
                .to("file://{{outbound.archive.path}}?fileName=$simple{date:now:yyyy-MM-dd-HH-mm-ss-SSS}{{outbound.file.write.ext}}");
    }
}
