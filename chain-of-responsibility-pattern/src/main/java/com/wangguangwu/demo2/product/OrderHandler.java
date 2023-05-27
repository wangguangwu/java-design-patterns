package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public abstract class OrderHandler {

    private final int capacity;
    private OrderHandler nextHandler;

    public OrderHandler(int capacity) {
        this.capacity = capacity;
    }

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleOrder(Order order) {
        if (order.getAmount() <= capacity) {
            handle(order);
        } else if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }

    protected abstract void handle(Order order);
}
