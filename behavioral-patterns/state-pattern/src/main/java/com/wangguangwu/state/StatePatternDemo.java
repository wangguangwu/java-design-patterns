package com.wangguangwu.state;

import com.wangguangwu.state.context.TrafficLight;

/**
 * 状态模式演示类
 * <p>
 * 状态模式（State Pattern）是一种行为型设计模式，它允许一个对象在其内部状态改变时改变其行为。
 * 对象看起来似乎修改了其类。
 * <p>
 * 主要优点：
 * 1. 封装了转换规则
 * 2. 枚举可能的状态
 * 3. 将所有与某个状态相关的行为放到一个类中
 * 4. 允许状态转换逻辑与状态相关的行为都放在同一个类中
 * 5. 状态转换清晰
 * <p>
 * 主要缺点：
 * 1. 状态过多时，类数量会增加
 * 2. 状态转换逻辑分散
 * 3. 可能导致循环依赖
 * <p>
 * 适用场景：
 * 1. 对象的行为取决于其状态
 * 2. 状态转换的条件表达式复杂
 * 3. 需要维护对象的状态历史
 * 4. 需要封装状态转换逻辑
 *
 * @author wangguangwu
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        // 创建交通灯
        TrafficLight trafficLight = new TrafficLight();

        // 模拟交通灯状态切换
        System.out.println("交通灯状态切换演示：");
        System.out.println("初始状态：");
        trafficLight.getState().display();

        System.out.println("\n切换到下一个状态：");
        trafficLight.next();

        System.out.println("\n切换到下一个状态：");
        trafficLight.next();

        System.out.println("\n切换到上一个状态：");
        trafficLight.previous();

        System.out.println("\n切换到上一个状态：");
        trafficLight.previous();
    }
}
