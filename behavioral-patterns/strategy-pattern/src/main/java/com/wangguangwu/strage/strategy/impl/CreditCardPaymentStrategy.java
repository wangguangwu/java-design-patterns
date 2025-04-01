package com.wangguangwu.strage.strategy.impl;

import com.wangguangwu.strage.context.PaymentContext;
import com.wangguangwu.strage.dto.PaymentInfo;
import com.wangguangwu.strage.strategy.PaymentStrategy;

/**
 * 信用卡支付策略类
 * <p>
 * 这是信用卡支付策略类，实现支付策略接口
 *
 * @author wangguangwu
 */
public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.printf(
                """
                        信用卡支付：%.2f元
                        卡号：**** **** **** %s
                        持卡人：%s
                        有效期：%s
                        支付成功！%n""",
                amount,
                getPaymentInfo().getAccount().substring(12),
                getPaymentInfo().getName(),
                getPaymentInfo().getExpiry()
        );
    }

    @Override
    public String getName() {
        return "信用卡支付";
    }

    @Override
    public boolean supports(PaymentInfo paymentInfo) {
        return "credit_card".equals(paymentInfo.getType()) &&
                paymentInfo.getExpiry() != null &&
                paymentInfo.getCvv() != null;
    }

    private PaymentInfo getPaymentInfo() {
        // 从上下文获取支付信息
        return PaymentContext.getInstance().getPaymentInfo();
    }
}