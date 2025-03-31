package com.wangguangwu.flyweight;

import com.wangguangwu.flyweight.product.Car;

/**
 * 享元模式演示类
 * <p>
 * 享元模式（Flyweight Pattern）是一种结构型设计模式，它使用共享对象来有效支持大量细粒度的对象。
 * <p>
 * 主要优点：
 * 1. 大量减少内存中对象的数量
 * 2. 提高了性能
 * 3. 符合开闭原则
 * <p>
 * 主要缺点：
 * 1. 增加了系统复杂度
 * 2. 可能导致代码难以维护
 * 3. 需要维护共享对象池
 * <p>
 * 适用场景：
 * 1. 当系统中有大量相似对象时
 * 2. 当需要减少内存使用时
 * 3. 当对象的大部分状态都可以外部化时
 *
 * @author wangguangwu
 */
public class FlyWeightPatternDemo {

    public static void main(String[] args) {

        // 创建并驾驶不同型号和颜色的汽车
        Car car1 = CarFactory.getCar("Model S", "Red");
        car1.drive(120, "北京");
        car1.drive(130, "上海");

        Car car2 = CarFactory.getCar("Model 3", "Blue");
        car2.drive(110, "广州");
        car2.drive(120, "深圳");

        Car car3 = CarFactory.getCar("Model Y", "Red");
        car3.drive(130, "杭州");
        car3.drive(140, "南京");

        // 输出汽车数量
        System.out.printf(
                "总共创建了 %d 辆汽车%n",
                CarFactory.getCarCount()
        );
    }
}
