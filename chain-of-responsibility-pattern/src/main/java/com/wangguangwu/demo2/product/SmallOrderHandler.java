package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public class SmallOrderHandler extends OrderHandler {

    public SmallOrderHandler(int capacity) {
        super(capacity);
    }

    @Override
    protected void handle(Order order) {
        System.out.println("Small order handler processing order of amount " + order.getAmount());
    }
}
