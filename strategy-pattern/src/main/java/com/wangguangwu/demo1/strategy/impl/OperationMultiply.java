package com.wangguangwu.demo1.strategy.impl;

import com.wangguangwu.demo1.strategy.Strategy;

/**
 * @author wangguangwu
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
