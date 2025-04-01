package com.wangguangwu.flyweight.flyweight.impl;

import com.wangguangwu.flyweight.flyweight.Car;

/**
 * 汽车实现类
 * <p>
 * 这是具体享元类，实现了享元接口
 *
 * @author wangguangwu
 */
public class CarImpl implements Car {

    private final String model;
    private final String color;

    /**
     * 构造函数
     *
     * @param model 汽车型号
     * @param color 汽车颜色
     */
    public CarImpl(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void drive(int speed, String location) {
        System.out.printf(
                "正在驾驶 %s %s，当前速度：%d km/h，位置：%s%n",
                color, model, speed, location
        );
    }
}
