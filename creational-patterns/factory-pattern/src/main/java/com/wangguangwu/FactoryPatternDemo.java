package com.wangguangwu;

import com.wangguangwu.factory.Creator;
import com.wangguangwu.factory.impl.ConcreteCreatorA;
import com.wangguangwu.factory.impl.ConcreteCreatorB;
import com.wangguangwu.product.Product;
import com.wangguangwu.product.impl.ConcreteProductA;
import com.wangguangwu.product.impl.ConcreteProductB;

/**
 * FactoryPatternDemo：工厂方法模式的演示类
 * <p>
 * 这个类展示了如何使用工厂方法模式来创建和使用对象
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
