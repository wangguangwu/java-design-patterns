package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.AbstractFactory;
import com.wangguangwu.product.ProductA;
import com.wangguangwu.product.ProductB;
import com.wangguangwu.product.impl.ConcreteProductA1;
import com.wangguangwu.product.impl.ConcreteProductB1;

/**
 * 具体工厂1：创建产品族1的对象
 * <p>
 * 这个工厂类负责创建产品族1的所有对象
 *
 * @author wangguangwu
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
