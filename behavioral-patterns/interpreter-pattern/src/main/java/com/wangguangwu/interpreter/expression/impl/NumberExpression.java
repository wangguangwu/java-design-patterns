package com.wangguangwu.interpreter.expression.impl;

import com.wangguangwu.interpreter.expression.Expression;

/**
 * 数字表达式类，表示一个具体的数字。
 *
 * @author wangguangwu
 */
public class NumberExpression implements Expression {

    private final int number;

    /**
     * 构造方法，初始化数字。
     *
     * @param number 数字
     */
    public NumberExpression(int number) {
        this.number = number;
    }

    /**
     * 返回数字本身。
     *
     * @return 数字
     */
    @Override
    public int interpret() {
        return number;
    }
}
