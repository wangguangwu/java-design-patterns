package com.wangguangwu.demo1.broker;

import com.wangguangwu.demo1.product.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguangwu
 */
public class Broker {

    List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
