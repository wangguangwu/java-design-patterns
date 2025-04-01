package com.wangguangwu;

import com.wangguangwu.factory.AbstractFactory;
import com.wangguangwu.factory.impl.ConcreteFactory1;
import com.wangguangwu.factory.impl.ConcreteFactory2;
import com.wangguangwu.product.ProductA;
import com.wangguangwu.product.ProductB;
import com.wangguangwu.product.impl.ConcreteProductA1;
import com.wangguangwu.product.impl.ConcreteProductA2;
import com.wangguangwu.product.impl.ConcreteProductB1;
import com.wangguangwu.product.impl.ConcreteProductB2;

/**
 * 抽象工厂模式演示类
 * <p>
 * 抽象工厂模式（Abstract Factory Pattern）是一种创建型设计模式，它提供了一种创建一系列相关或相互依赖对象的接口，
 * 而无需指定它们具体的类。这种模式强调的是创建对象的家族，而不是单个对象。
 * <p>
 * 主要优点：
 * 1. 将客户端与具体类解耦
 * 2. 提供了一组相关对象的创建接口
 * 3. 便于添加新的产品族
 * 4. 支持开闭原则
 * <p>
 * 主要缺点：
 * 1. 系统中类的个数会增加
 * 2. 需要维护多个工厂类
 * 3. 添加新产品族比较容易，但添加新的产品等级结构比较困难
 * <p>
 * 适用场景：
 * 1. 需要创建一组相关或相互依赖的对象时
 * 2. 系统需要独立于如何创建、组合和表示它的产品时
 * 3. 需要确保一个对象族中的对象是相互匹配的时
 * 4. 提供一个产品类库，想隐藏产品的具体实现时
 *
 * @author wangguangwu
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        System.out.println("\n=== 抽象工厂模式演示 ===\n");

        // 演示场景：创建不同品牌的电脑和鼠标
        // 假设我们需要创建两种不同品牌的电脑和鼠标：Apple 和 Lenovo

        // 1. 使用 Apple 品牌的工厂创建产品
        System.out.println("=== 使用 Apple 品牌的工厂 ===");
        AbstractFactory appleFactory = new ConcreteFactory1();
        ProductA appleComputer = appleFactory.createProductA();
        ProductB appleMouse = appleFactory.createProductB();

        // 使用 Apple 产品
        System.out.println("\n使用 Apple 产品:");
        appleComputer.doStuff();
        appleMouse.doStuff();

        // 2. 使用 Lenovo 品牌的工厂创建产品
        System.out.println("\n=== 使用 Lenovo 品牌的工厂 ===");
        AbstractFactory lenovoFactory = new ConcreteFactory2();
        ProductA lenovoComputer = lenovoFactory.createProductA();
        ProductB lenovoMouse = lenovoFactory.createProductB();

        // 使用 Lenovo 产品
        System.out.println("\n使用 Lenovo 产品:");
        lenovoComputer.doStuff();
        lenovoMouse.doStuff();

        // 3. 验证产品是否属于同一系列
        System.out.println("\n=== 验证产品系列 ===");
        System.out.println("Apple 产品是否来自同一家族: " +
                (appleComputer instanceof ConcreteProductA1 && appleMouse instanceof ConcreteProductB1));
        System.out.println("Lenovo 产品是否来自同一家族: " +
                (lenovoComputer instanceof ConcreteProductA2 && lenovoMouse instanceof ConcreteProductB2));

        // 4. 显示具体产品类型
        System.out.println("\n=== 显示具体产品类型 ===");
        System.out.println("Apple Computer 是 ConcreteProductA1 的实例: " + (appleComputer instanceof ConcreteProductA1));
        System.out.println("Apple Mouse 是 ConcreteProductB1 的实例: " + (appleMouse instanceof ConcreteProductB1));
        System.out.println("Lenovo Computer 是 ConcreteProductA2 的实例: " + (lenovoComputer instanceof ConcreteProductA2));
        System.out.println("Lenovo Mouse 是 ConcreteProductB2 的实例: " + (lenovoMouse instanceof ConcreteProductB2));

        // 5. 演示使用不同系列的产品
        System.out.println("\n=== 演示使用不同系列的产品 ===");
        System.out.println("\n使用 Apple 系列:");
        appleComputer.doStuff();
        appleMouse.doStuff();

        System.out.println("\n使用 Lenovo 系列:");
        lenovoComputer.doStuff();
        lenovoMouse.doStuff();

        // 6. 演示错误的组合（不同系列的产品不能一起使用）
        System.out.println("\n=== 演示错误的组合 ===");
        System.out.println("注意：不同系列的产品不能一起使用！");
        System.out.println("错误示例：尝试将 Apple 的电脑与 Lenovo 的鼠标一起使用");
        System.out.println("这种组合可能会导致兼容性问题");
    }
}