package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.AbstractFactory;
import com.wangguangwu.product.ProductA;
import com.wangguangwu.product.ProductB;
import com.wangguangwu.product.impl.ConcreteProductA2;
import com.wangguangwu.product.impl.ConcreteProductB2;

/**
 * 具体工厂2：创建产品族2的对象
 * <p>
 * 这个工厂类负责创建产品族2的所有对象
 *
 * @author wangguangwu
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
