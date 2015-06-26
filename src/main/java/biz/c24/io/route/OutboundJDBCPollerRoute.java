package biz.c24.io.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class OutboundJDBCPollerRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        onException(Exception.class).maximumRedeliveries(1).handled(false);


        from("timer://PollForMessageUpdates?period={{outbound.jdbc.poller.fixed.rate}}")
                .routeId("outboundJdbcPollerRoute")
                .setBody(constant("select * from purchase_order where Processed=0"))
                .to("jdbc:dataSource")
                .to("direct:outboundMessageHandling");
    }


}
