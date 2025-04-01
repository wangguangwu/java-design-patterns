package com.wangguangwu;

import com.wangguangwu.factory.Creator;
import com.wangguangwu.factory.impl.ConcreteCreatorA;
import com.wangguangwu.factory.impl.ConcreteCreatorB;
import com.wangguangwu.product.Product;
import com.wangguangwu.product.impl.ConcreteProductA;
import com.wangguangwu.product.impl.ConcreteProductB;

/**
 * 工厂方法模式演示类
 * <p>
 * 工厂方法模式（Factory Method Pattern）是一种创建型设计模式，它定义了一个创建对象的接口，
 * 但让子类决定要实例化的类是哪一个。工厂方法让类的实例化推迟到子类。
 * <p>
 * 主要优点：
 * 1. 将对象的创建和使用分离
 * 2. 支持开闭原则
 * 3. 提供了创建对象的统一接口
 * 4. 支持创建复杂的对象
 * <p>
 * 主要缺点：
 * 1. 每个产品都需要一个对应的工厂类
 * 2. 代码复杂度增加
 * 3. 需要维护多个工厂类
 * <p>
 * 适用场景：
 * 1. 创建对象需要大量重复代码时
 * 2. 创建对象需要使用特定的配置时
 * 3. 需要创建的对象类型可能发生变化时
 * 4. 创建对象的过程需要被子类控制时
 *
 * @author wangguangwu
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        // 使用具体工厂A创建产品
        Creator creatorA = new ConcreteCreatorA();
        // 输出: ConcreteProductA is doing stuff.
        creatorA.someOperation();

        // 使用具体工厂B创建产品
        Creator creatorB = new ConcreteCreatorB();
        // 输出: ConcreteProductB is doing stuff.
        creatorB.someOperation();

        // 展示如何直接使用工厂方法创建对象
        Product productA = creatorA.createProduct();
        Product productB = creatorB.createProduct();

        // 验证创建的对象类型
        // true
        System.out.println(productA instanceof ConcreteProductA);
        // true
        System.out.println(productB instanceof ConcreteProductB);
    }
}
