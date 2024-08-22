package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.AbstractFactory;
import com.wangguangwu.product.ProductA;
import com.wangguangwu.product.ProductB;
import com.wangguangwu.product.impl.ConcreteProductA1;
import com.wangguangwu.product.impl.ConcreteProductB1;

/**
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
