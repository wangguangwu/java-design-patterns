package com.wangguangwu.mediator;

import com.wangguangwu.mediator.compent.Aircraft;
import com.wangguangwu.mediator.compent.Airplane;
import com.wangguangwu.mediator.mediator.ControlTower;
import com.wangguangwu.mediator.mediator.Mediator;

/**
 * 中介者模式演示类
 * <p>
 * 中介者模式（Mediator Pattern）是一种行为型设计模式，它使用一个中介对象来封装一系列的对象交互。
 * 中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * <p>
 * 主要优点：
 * 1. 简化了对象之间的交互
 * 2. 减少了对象之间的依赖
 * 3. 提供了集中的控制点
 * 4. 支持松耦合
 * <p>
 * 主要缺点：
 * 1. 中介者对象可能会变得很复杂
 * 2. 系统的复杂性转移到了中介者
 * 3. 可能导致中介者对象难以维护
 * <p>
 * 适用场景：
 * 1. 对象之间存在复杂的交互关系
 * 2. 需要集中管理对象之间的交互
 * 3. 需要降低对象之间的耦合度
 * 4. 需要支持对象之间的松耦合
 *
 * @author wangguangwu
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        // 创建空中交通管制塔
        Mediator controlTower = new ControlTower();

        // 创建飞机1并注册
        Aircraft airplane1 = new Airplane("AP101", controlTower);
        controlTower.registerAircraft(airplane1);

        // 创建飞机2并注册
        Aircraft airplane2 = new Airplane("AP102", controlTower);
        controlTower.registerAircraft(airplane2);

        // 飞机1请求降落
        System.out.println("\n飞机1请求降落：");
        airplane1.requestToLand();

        // 飞机2请求降落
        System.out.println("\n飞机2请求降落：");
        airplane2.requestToLand();

        // 飞机1请求起飞
        System.out.println("\n飞机1请求起飞：");
        airplane1.requestToTakeOff();

        // 飞机2请求降落
        System.out.println("\n飞机2请求降落：");
        airplane2.requestToLand();

        // 输出结果：
        // 注册飞行器：AP101
        // 注册飞行器：AP102
        //
        // 飞机1请求降落：
        // 允许降落：AP101
        //
        // 飞机2请求降落：
        // 等待降落：AP102，当前有飞行器正在降落
        // 飞行器 AP101 收到通知：等待降落，当前有飞行器正在降落
        //
        // 飞机1请求起飞：
        // 允许起飞：AP101
        //
        // 飞机2请求降落：
        // 允许降落：AP102
    }
}
