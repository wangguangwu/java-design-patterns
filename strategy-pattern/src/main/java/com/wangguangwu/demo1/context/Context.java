package com.wangguangwu.demo1.context;

import com.wangguangwu.demo1.strategy.Strategy;

/**
 * @author wangguangwu
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}