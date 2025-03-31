package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.Creator;
import com.wangguangwu.product.Product;
import com.wangguangwu.product.impl.ConcreteProductA;

/**
 * ConcreteCreatorA：具体工厂类A
 * <p>
 * 这个工厂类负责创建ConcreteProductA类型的对象
 *
 * @author wangguangwu
 */
public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
