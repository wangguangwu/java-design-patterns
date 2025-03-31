package com.wangguangwu.facade;

import com.wangguangwu.facade.product.Computer;

/**
 * 外观模式演示类
 * <p>
 * 外观模式（Facade Pattern）是一种结构型设计模式，它提供了一个统一的接口来访问复杂的子系统。
 * <p>
 * 主要优点：
 * 1. 降低系统的复杂度
 * 2. 提高了代码的可维护性
 * 3. 减少了依赖关系
 * <p>
 * 主要缺点：
 * 1. 违反了开闭原则
 * 2. 可能导致外观类过于庞大
 * 3. 可能导致系统结构不清晰
 * <p>
 * 适用场景：
 * 1. 当需要为复杂的子系统提供一个简单的接口时
 * 2. 当需要降低子系统之间的耦合度时
 * 3. 当需要提供一个统一的接口来访问多个子系统时
 *
 * @author wangguangwu
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();

        // 启动计算机
        System.out.println("启动计算机：");
        computer.start();
    }
}
