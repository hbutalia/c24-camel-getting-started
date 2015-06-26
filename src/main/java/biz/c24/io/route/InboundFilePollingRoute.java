package biz.c24.io.route;

import biz.c24.io.gettingstarted.purchaseorder.Purchase_orderElement;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static biz.c24.io.camel.c24io.CamelC24IO.c24io;

@Component
public class InboundFilePollingRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        onException(Exception.class).maximumRedeliveries(1).handled(false);

        from("file://{{inbound.read.path}}?idempotent=true&delay={{inbound.file.poller.fixed.delay}}&move={{inbound.processed.path}}&moveFailed={{inbound.failed.path}}")
                .routeId("inboundFilePollingRoute")
                .unmarshal(c24io(Purchase_orderElement.class))
                .to("direct:inboundMessageHandling");
    }



}
