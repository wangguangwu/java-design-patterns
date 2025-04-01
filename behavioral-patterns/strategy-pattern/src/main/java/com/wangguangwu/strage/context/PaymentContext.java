package com.wangguangwu.strage.context;

import com.wangguangwu.strage.dto.PaymentInfo;
import com.wangguangwu.strage.strategy.PaymentStrategy;
import com.wangguangwu.strage.strategy.impl.BankTransferPaymentStrategy;
import com.wangguangwu.strage.strategy.impl.CreditCardPaymentStrategy;
import com.wangguangwu.strage.strategy.impl.WalletPaymentStrategy;

/**
 * 支付上下文类
 * <p>
 * 这是支付上下文类，负责管理支付策略的切换和执行
 *
 * @author wangguangwu
 */
public class PaymentContext {

    private static final PaymentContext INSTANCE = new PaymentContext();
    private static final PaymentStrategy[] STRATEGIES = {
        new CreditCardPaymentStrategy(),
        new BankTransferPaymentStrategy(),
        new WalletPaymentStrategy()
    };

    private PaymentInfo paymentInfo;
    private PaymentStrategy strategy;

    /**
     * 单例模式：获取实例
     *
     * @return 实例对象
     */
    public static PaymentContext getInstance() {
        return INSTANCE;
    }

    /**
     * 设置支付信息
     *
     * @param paymentInfo 支付信息
     */
    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        // 自动选择合适的支付策略
        selectStrategy();
    }

    /**
     * 获取支付信息
     *
     * @return 支付信息
     */
    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * 执行支付
     *
     * @param amount 金额
     */
    public void executePayment(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("未设置支付信息或未找到合适的支付策略");
        }
        System.out.printf(
                "开始支付：%.2f元\n" +
                        "支付方式：%s%n",
                amount,
                strategy.getName()
        );
        strategy.pay(amount);
    }

    /**
     * 自动选择支付策略
     */
    private void selectStrategy() {
        if (paymentInfo == null) {
            return;
        }

        for (PaymentStrategy candidate : STRATEGIES) {
            if (candidate.supports(paymentInfo)) {
                strategy = candidate;
                break;
            }
        }
    }
}
