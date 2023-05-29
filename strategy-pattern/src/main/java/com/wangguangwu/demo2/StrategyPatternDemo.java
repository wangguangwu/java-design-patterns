package com.wangguangwu.demo2;

import com.wangguangwu.demo2.context.Payment;
import com.wangguangwu.demo2.strategy.impl.BankTransferPaymentStrategy;
import com.wangguangwu.demo2.strategy.impl.CreditCardPaymentStrategy;
import com.wangguangwu.demo2.strategy.impl.WalletPaymentStrategy;

/**
 * @author wangguangwu
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Payment payment = new Payment(new CreditCardPaymentStrategy());
        payment.makePayment(100);

        payment.setStrategy(new WalletPaymentStrategy());
        payment.makePayment(200);

        payment.setStrategy(new BankTransferPaymentStrategy());
        payment.makePayment(300);
    }
}
