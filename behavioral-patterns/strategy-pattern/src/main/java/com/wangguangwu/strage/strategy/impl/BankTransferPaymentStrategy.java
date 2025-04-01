package com.wangguangwu.strage.strategy.impl;

import com.wangguangwu.strage.context.PaymentContext;
import com.wangguangwu.strage.dto.PaymentInfo;
import com.wangguangwu.strage.strategy.PaymentStrategy;

/**
 * 银行转账支付策略类
 * <p>
 * 这是银行转账支付策略类，实现支付策略接口
 *
 * @author wangguangwu
 */
public class BankTransferPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.printf(
                """
                        银行转账支付：%.2f元
                        银行：%s
                        账号：**** **** **** %s
                        账户持有人：%s
                        支付成功！%n""",
                amount,
                getPaymentInfo().getBank(),
                getPaymentInfo().getAccount().substring(12),
                getPaymentInfo().getName()
        );
    }

    @Override
    public String getName() {
        return "银行转账支付";
    }

    @Override
    public boolean supports(PaymentInfo paymentInfo) {
        return "bank_transfer".equals(paymentInfo.getType()) &&
                paymentInfo.getBank() != null;
    }

    private PaymentInfo getPaymentInfo() {
        // 从上下文获取支付信息
        return PaymentContext.getInstance().getPaymentInfo();
    }
}