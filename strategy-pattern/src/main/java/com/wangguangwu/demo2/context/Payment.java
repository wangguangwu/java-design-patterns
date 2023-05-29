package com.wangguangwu.demo2.context;

import com.wangguangwu.demo2.strategy.PaymentStrategy;

/**
 * @author wangguangwu
 */
public class Payment {

    private PaymentStrategy strategy;

    public Payment(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.strategy = paymentStrategy;
    }

    public void makePayment(int amount) {
        strategy.pay(amount);
    }
}
