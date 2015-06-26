package biz.c24.io.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class OutboundUpdatePollRowRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:outboundUpdatePoll")
                .routeId("outboundUpdatePollRoute")
                .setBody(constant("update purchase_order set Processed = 1 where ID = :?orderId"))
                .to("jdbc:dataSource?useHeadersAsParameters=true");
    }
}
