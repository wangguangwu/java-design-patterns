package com.wangguangwu.strage.strategy.impl;

import com.wangguangwu.strage.context.PaymentContext;
import com.wangguangwu.strage.dto.PaymentInfo;
import com.wangguangwu.strage.strategy.PaymentStrategy;

/**
 * 钱包支付策略类
 * <p>
 * 这是钱包支付策略类，实现支付策略接口
 *
 * @author wangguangwu
 */
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf(
                """
                        %s支付：%.2f元
                        手机号：**** **** %s
                        支付成功！%n""",
                getPaymentInfo().getBank(),
                amount,
                getPaymentInfo().getAccount().substring(8)
        );
    }

    @Override
    public String getName() {
        return String.format("%s支付", getPaymentInfo().getBank());
    }

    @Override
    public boolean supports(PaymentInfo paymentInfo) {
        return "wallet".equals(paymentInfo.getType()) &&
                paymentInfo.getBank() != null;
    }

    private PaymentInfo getPaymentInfo() {
        // 从上下文获取支付信息
        return PaymentContext.getInstance().getPaymentInfo();
    }
}
