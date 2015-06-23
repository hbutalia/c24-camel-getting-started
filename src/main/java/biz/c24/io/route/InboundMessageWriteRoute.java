package biz.c24.io.route;

import biz.c24.io.camel.c24io.C24IOContentType;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static biz.c24.io.camel.c24io.CamelC24IO.c24io;

@Component
public class InboundMessageWriteRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:inboundMessageWrite")
                .routeId("inboundMessageWriteRoute")
                .marshal(c24io(C24IOContentType.Xml))
                .to("file://{{inbound.write.path}}?fileName=$simple{date:now:yyyy-MM-dd-HH-mm-ss-SSS}{{inbound.write.filename.ext}}");
    }
}
