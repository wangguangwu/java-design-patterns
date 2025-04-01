package com.wangguangwu.observer;

import com.wangguangwu.observer.observer.impl.AlertSystem;
import com.wangguangwu.observer.observer.impl.GuiDisplay;
import com.wangguangwu.observer.observable.impl.WeatherStation;
import com.wangguangwu.observer.observer.Observer;

/**
 * 观察者模式演示类
 * <p>
 * 观察者模式（Observer Pattern）是一种行为型设计模式，它定义了对象之间的一对多依赖关系，当一个对象的状态发生改变时，
 * 所有依赖于它的对象都会得到通知并自动更新。
 * <p>
 * 主要优点：
 * 1. 支持广播通信
 * 2. 降低耦合度
 * 3. 支持动态添加和移除观察者
 * 4. 支持事件驱动编程
 * <p>
 * 主要缺点：
 * 1. 可能导致循环依赖
 * 2. 需要维护观察者列表
 * 3. 可能导致性能问题
 * <p>
 * 适用场景：
 * 1. 需要通知多个对象
 * 2. 需要支持动态添加和移除观察者
 * 3. 需要支持事件驱动编程
 *
 * @author wangguangwu
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        // 创建天气站
        WeatherStation station = new WeatherStation();

        // 创建观察者
        Observer gui = new GuiDisplay();
        Observer alertSystem = new AlertSystem();

        // 添加观察者
        station.addObserver(gui);
        station.addObserver(alertSystem);

        // 更新温度
        System.out.println("第一次温度更新：");
        station.setTemperature(20);
        System.out.println("==========================");

        System.out.println("第二次温度更新：");
        station.setTemperature(35);
    }
}
