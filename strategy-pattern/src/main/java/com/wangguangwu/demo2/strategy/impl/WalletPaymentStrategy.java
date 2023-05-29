package com.wangguangwu.demo2.strategy.impl;

import com.wangguangwu.demo2.strategy.PaymentStrategy;

/**
 * @author wangguangwu
 */
public class WalletPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Wallet.");
    }
}
