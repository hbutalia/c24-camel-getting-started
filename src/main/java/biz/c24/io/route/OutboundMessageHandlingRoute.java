package biz.c24.io.route;

import biz.c24.io.camel.c24io.C24IOContentType;
import biz.c24.io.camel.c24io.CamelC24IO;
import biz.c24.io.persistence.OrderRowMapper;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class OutboundMessageHandlingRoute extends RouteBuilder {

    private OrderRowMapper orderRowMapper = new OrderRowMapper();

    @Override
    public void configure() throws Exception {
        from("direct:outboundMessageHandling")
                .routeId("outboundMessageHandlingRoute")
                .split(body())
                .process(orderRowMapper)
                .setHeader("orderId", simple("${body.getID()}"))
                .marshal(CamelC24IO.c24io(C24IOContentType.Json))
                .multicast().to("direct:outboundJms", "direct:outboundMessageWrite", "direct:outboundUpdatePoll");
    }
}
