package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.AbstractFactory;
import com.wangguangwu.product.ProductA;
import com.wangguangwu.product.ProductB;
import com.wangguangwu.product.impl.ConcreteProductA2;
import com.wangguangwu.product.impl.ConcreteProductB2;

/**
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
