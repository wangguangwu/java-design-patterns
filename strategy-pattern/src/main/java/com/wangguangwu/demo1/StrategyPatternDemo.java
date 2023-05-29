package com.wangguangwu.demo1;

import com.wangguangwu.demo1.context.Context;
import com.wangguangwu.demo1.strategy.impl.OperationAdd;
import com.wangguangwu.demo1.strategy.impl.OperationMultiply;
import com.wangguangwu.demo1.strategy.impl.OperationSubtract;

/**
 * @author wangguangwu
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
