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
 * 演示抽象工厂模式。
 *
 * @author wangguangwu
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // 创建并使用工厂1的产品
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        // 输出产品1的操作信息
        productA1.doStuff(); // 输出: ConcreteProductA1 正在执行操作。
        productB1.doStuff(); // 输出: ConcreteProductB1 正在执行操作。

        // 创建并使用工厂2的产品
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        // 输出产品2的操作信息
        productA2.doStuff(); // 输出: ConcreteProductA2 正在执行操作。
        productB2.doStuff(); // 输出: ConcreteProductB2 正在执行操作。

        // 验证产品是否属于同一系列
        System.out.println("ProductA1 和 ProductB1 来自同一家族: " +
                (productA1 instanceof ConcreteProductA1 && productB1 instanceof ConcreteProductB1));
        System.out.println("ProductA2 和 ProductB2 来自同一家族: " +
                (productA2 instanceof ConcreteProductA2 && productB2 instanceof ConcreteProductB2));

        // 显示产品类型以进行验证
        System.out.println("ProductA1 是 ConcreteProductA1 的实例: " + (productA1 instanceof ConcreteProductA1));
        System.out.println("ProductB1 是 ConcreteProductB1 的实例: " + (productB1 instanceof ConcreteProductB1));
        System.out.println("ProductA2 是 ConcreteProductA2 的实例: " + (productA2 instanceof ConcreteProductA2));
        System.out.println("ProductB2 是 ConcreteProductB2 的实例: " + (productB2 instanceof ConcreteProductB2));

        // 显示使用两个系列的产品
        System.out.println("\n使用产品系列1:");
        productA1.doStuff();
        productB1.doStuff();

        System.out.println("\n使用产品系列2:");
        productA2.doStuff();
        productB2.doStuff();
    }
}
