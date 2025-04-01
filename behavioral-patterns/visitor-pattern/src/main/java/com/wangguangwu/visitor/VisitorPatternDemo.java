package com.wangguangwu.visitor;

import com.wangguangwu.visitor.element.impl.Computer;
import com.wangguangwu.visitor.element.impl.Keyboard;
import com.wangguangwu.visitor.element.impl.Monitor;
import com.wangguangwu.visitor.element.impl.Mouse;
import com.wangguangwu.visitor.visitor.ComputerPartVisitor;
import com.wangguangwu.visitor.visitor.impl.ComputerPartDisplayVisitor;

/**
 * 访问者模式演示类
 * <p>
 * 访问者模式（Visitor Pattern）是一种行为型设计模式，它允许在不修改对象结构的情况下，
 * 为对象添加新的操作。访问者模式将数据结构与数据操作分离，使操作集合可独立于数据结构变化。
 * <p>
 * 主要优点：
 * 1. 添加新的操作容易
 * 2. 修改对象结构容易
 * 3. 将相关操作集中
 * 4. 支持操作组合
 * 5. 支持操作扩展
 * <p>
 * 主要缺点：
 * 1. 增加对象类困难
 * 2. 破坏封装性
 * 3. 违反依赖倒置原则
 * 4. 代码复杂度增加
 * <p>
 * 适用场景：
 * 1. 需要对对象结构进行多种操作
 * 2. 需要添加新的操作
 * 3. 需要修改对象结构
 * 4. 需要支持操作组合
 *
 * @author wangguangwu
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        // 创建计算机
        Computer computer = new Computer();

        // 添加部件
        computer.addPart(new Keyboard());
        computer.addPart(new Mouse());
        computer.addPart(new Monitor());

        // 创建访问者
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        // 访问计算机及其部件
        System.out.println("\n访问计算机及其部件：");
        computer.accept(visitor);
    }
}
