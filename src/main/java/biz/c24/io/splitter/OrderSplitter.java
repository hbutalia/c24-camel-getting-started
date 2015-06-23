package biz.c24.io.splitter;

import biz.c24.io.gettingstarted.Order;
import biz.c24.io.gettingstarted.Orders;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderSplitter {

    public List<Order> split(Orders orders) {
        return orders.getOrders();
    }
}
