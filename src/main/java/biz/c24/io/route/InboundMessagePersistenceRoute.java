package biz.c24.io.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class InboundMessagePersistenceRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        from("direct:inboundMessagePersistence")
                .routeId("inboundMessagePersistenceRoute")
                .to("bean:orderService?method=insertOrder");
    }
}
