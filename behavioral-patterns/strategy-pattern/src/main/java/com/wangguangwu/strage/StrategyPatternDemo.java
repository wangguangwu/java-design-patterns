package com.wangguangwu.strage;

import com.wangguangwu.strage.context.PaymentContext;
import com.wangguangwu.strage.dto.PaymentInfo;

/**
 * 策略模式演示类
 * <p>
 * 策略模式（Strategy Pattern）是一种行为型设计模式，它定义了一系列可互换的算法，并将这些算法封装在独立的类中。
 * 这样，算法可以在运行时动态地改变。
 * <p>
 * 主要优点：
 * 1. 提供了算法的封装
 * 2. 支持算法的动态切换
 * 3. 避免了条件语句
 * 4. 提供了代码复用
 * 5. 支持开闭原则
 * <p>
 * 主要缺点：
 * 1. 客户端需要了解算法的差异
 * 2. 策略类数量可能增加
 * 3. 可能导致类膨胀
 * <p>
 * 适用场景：
 * 1. 需要使用不同的算法
 * 2. 需要动态切换算法
 * 3. 需要避免条件语句
 * 4. 需要支持开闭原则
 *
 * @author wangguangwu
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        // 创建支付上下文
        PaymentContext paymentContext = PaymentContext.getInstance();

        // 设置信用卡支付信息
        System.out.println("\n使用信用卡支付：");
        paymentContext.setPaymentInfo(new PaymentInfo(
                "credit_card",
                "4111111111111111",
                "John Doe",
                "12/25",
                "123",
                null,
                null
        ));
        paymentContext.executePayment(100.00);

        // 设置银行转账支付信息
        System.out.println("\n使用银行转账支付：");
        paymentContext.setPaymentInfo(new PaymentInfo(
                "bank_transfer",
                "6222081234567890",
                "John Doe",
                null,
                null,
                "中国工商银行",
                null
        ));
        paymentContext.executePayment(200.00);

        // 设置钱包支付信息
        System.out.println("\n使用钱包支付：");
        paymentContext.setPaymentInfo(new PaymentInfo(
                "wallet",
                "13800138000",
                null,
                null,
                null,
                "支付宝",
                null
        ));
        paymentContext.executePayment(300.00);
    }
}
