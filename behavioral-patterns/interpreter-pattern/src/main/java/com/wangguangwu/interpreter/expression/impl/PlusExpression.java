package com.wangguangwu.interpreter.expression.impl;

import com.wangguangwu.interpreter.expression.Expression;

/**
 * 加法表达式类，表示两个表达式相加。
 *
 * @author wangguangwu
 */
public class PlusExpression implements Expression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    /**
     * 构造方法，初始化左右表达式。
     *
     * @param leftExpression  左表达式
     * @param rightExpression 右表达式
     */
    public PlusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    /**
     * 返回两个表达式的和。
     *
     * @return 和
     */
    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
