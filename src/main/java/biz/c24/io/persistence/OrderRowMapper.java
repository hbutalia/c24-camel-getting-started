package biz.c24.io.persistence;

import biz.c24.io.gettingstarted.Order;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Map;

@Component
public class OrderRowMapper implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Map<String, Object> orderMap = exchange.getIn().getBody(Map.class);
        Order order = new Order();
        order.setID((String) orderMap.get("ID"));
        order.setAddress((String) orderMap.get("ADDRESS"));
        order.setCurrency((String) orderMap.get("CURRENCY"));
        order.setCustomer_name((String) orderMap.get("CUSTOMER_NAME"));
        order.setDay_of_week((String) orderMap.get("DAY_OF_WEEK"));
        order.setDelivery_time_slot((Time) orderMap.get("DELIVERY_TIME_SLOT"));
        order.setLine_item_description((String) orderMap.get("LINE_ITEM_DESCRIPTION"));
        order.setPer_ounce_rate((BigDecimal) orderMap.get("PER_OUNCE_RATE"));
        order.setPer_unit_ounces((BigDecimal) orderMap.get("PER_UNIT_OUNCES"));
        order.setPo_number((String) orderMap.get("PO_NUMBER"));
        order.setPrice((Double) orderMap.get("PRICE"));
        order.setPurchase_date((Timestamp) orderMap.get("PURCHASE_DATE"));
        order.setQuantity((Integer) orderMap.get("QUANTITY"));
        order.setShipper_name((String) orderMap.get("SHIPPER_NAME"));
        order.setShipping_date((Date) orderMap.get("SHIPPING_DATE"));
        exchange.getOut().setBody(order);
    }
}
