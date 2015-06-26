package biz.c24.io.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class OutboundJmsRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:outboundJms")
                .routeId("outboundJmsRoute")
                .to("jms:queue:{{outbound.queue}}");
    }
}
