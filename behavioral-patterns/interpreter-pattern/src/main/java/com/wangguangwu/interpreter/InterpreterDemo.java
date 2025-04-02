package com.wangguangwu.interpreter;

import com.wangguangwu.interpreter.expression.Expression;
import com.wangguangwu.interpreter.expression.impl.MinusExpression;
import com.wangguangwu.interpreter.expression.impl.NumberExpression;
import com.wangguangwu.interpreter.expression.impl.PlusExpression;

/**
 * 解释器模式演示类
 * <p>
 * 解释器模式（Interpreter Pattern）是一种行为型设计模式，它定义了一种语言的文法表示，并提供一个解释器来处理该语言中的句子。
 * 这种模式用于实现一个表达式接口，该接口定义了解释器的接口方法。
 * <p>
 * 主要优点：
 * 1. 易于改变和扩展文法
 * 2. 每个文法规则都可以表示为一个类
 * <p>
 * 主要缺点：
 * 1. 复杂的文法难以维护
 * 2. 每个文法规则都需要定义一个类，可能导致类的数量急剧增加
 * <p>
 * 适用场景：
 * 1. 需要解释执行的场景
 * 2. 一些重复出现的问题可以用一种简单的语言来表达
 * 3. 一个简单语法需要解释的场景
 *
 * @author wangguangwu
 */
public class InterpreterDemo {

    /**
     * 主方法，演示解释器模式。
     *
     * @param args 命令行参数
     * @wangguangwu
     */
    public static void main(String[] args) {
        // 构建表达式: (5 + 3) - 2
        Expression expression = new MinusExpression(
                new PlusExpression(
                        new NumberExpression(5),
                        new NumberExpression(3)
                ),
                new NumberExpression(2)
        );

        // 解释并打印结果
        int result = expression.interpret();
        // 输出: Result: 6
        System.out.println("Result: " + result);
    }
}
