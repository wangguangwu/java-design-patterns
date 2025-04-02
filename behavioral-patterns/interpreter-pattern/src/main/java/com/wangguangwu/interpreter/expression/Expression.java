package com.wangguangwu.interpreter.expression;

/**
 * 表达式接口，定义了解释器的接口方法。
 *
 * @author wangguangwu
 */
public interface Expression {

    /**
     * 解释方法，返回计算结果。
     *
     * @return 计算结果
     */
    int interpret();
}
