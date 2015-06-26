package biz.c24.io.route;


import biz.c24.io.camel.c24io.C24IOTransform;
import biz.c24.io.camel.c24io.C24IOValidator;
import biz.c24.io.splitter.OrderSplitter;
import nonamespace.PurchaseOrderToFlatOrderTransform;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class InboundMessageHandlingRoute extends RouteBuilder {

    final C24IOValidator validator = new C24IOValidator();

    final C24IOTransform transform = new C24IOTransform(new PurchaseOrderToFlatOrderTransform());


    @Override
    public void configure() throws Exception {
        from("direct:inboundMessageHandling")
                .routeId("inboundMessageHandlingRoute")
                .process(validator)
                .process(transform)
                .split().method(OrderSplitter.class, "split")
                .multicast().to("direct:inboundMessagePersistence", "direct:inboundMessageWrite");
    }
}
