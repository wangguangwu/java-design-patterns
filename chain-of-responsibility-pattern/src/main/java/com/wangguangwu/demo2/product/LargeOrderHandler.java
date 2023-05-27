package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public class LargeOrderHandler extends OrderHandler {

    public LargeOrderHandler(int capacity) {
        super(capacity);
    }

    @Override
    protected void handle(Order order) {
        System.out.println("Large order handler processing order of amount " + order.getAmount());
    }
}
