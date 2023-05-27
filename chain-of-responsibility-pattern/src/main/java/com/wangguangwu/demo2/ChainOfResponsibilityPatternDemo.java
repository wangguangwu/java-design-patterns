package com.wangguangwu.demo2;

import com.wangguangwu.demo2.product.LargeOrderHandler;
import com.wangguangwu.demo2.product.Order;
import com.wangguangwu.demo2.product.OrderHandler;
import com.wangguangwu.demo2.product.SmallOrderHandler;

/**
 * @author wangguangwu
 */
public class ChainOfResponsibilityPatternDemo {

    public static void main(String[] args) {
        OrderHandler smallOrderHandler = new SmallOrderHandler(100);
        OrderHandler largeOrderHandler = new LargeOrderHandler(1000);

        smallOrderHandler.setNextHandler(largeOrderHandler);

        smallOrderHandler.handleOrder(new Order(50));
        smallOrderHandler.handleOrder(new Order(150));
        smallOrderHandler.handleOrder(new Order(500));
        smallOrderHandler.handleOrder(new Order(1500));
    }
}
