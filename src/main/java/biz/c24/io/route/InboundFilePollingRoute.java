package biz.c24.io.route;

import biz.c24.io.camel.c24io.C24IOContentType;
import biz.c24.io.camel.c24io.C24IOTransform;
import biz.c24.io.camel.c24io.C24IOValidator;
import biz.c24.io.gettingstarted.purchaseorder.Purchase_orderElement;
import biz.c24.io.persistence.OrderService;
import biz.c24.io.splitter.OrderSplitter;
import nonamespace.PurchaseOrderToFlatOrderTransform;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.OnExceptionDefinition;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

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
