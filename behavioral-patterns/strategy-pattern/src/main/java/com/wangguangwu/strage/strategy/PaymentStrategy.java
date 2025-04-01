package com.wangguangwu.strage.strategy;

import com.wangguangwu.strage.dto.PaymentInfo;

/**
 * 支付策略接口
 * <p>
 * 这是支付策略接口，定义了支付行为
 *
 * @author wangguangwu
 */
public interface PaymentStrategy {
    /**
     * 支付金额
     *
     * @param amount 金额
     */
    void pay(double amount);

    /**
     * 获取支付方式名称
     *
     * @return 支付方式名称
     */
    String getName();

    /**
     * 判断是否支持此支付方式
     *
     * @param paymentInfo 支付信息
     * @return 是否支持
     */
    boolean supports(PaymentInfo paymentInfo);
}