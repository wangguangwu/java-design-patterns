package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.Creator;
import com.wangguangwu.product.Product;
import com.wangguangwu.product.impl.ConcreteProductB;

/**
 * ConcreteCreatorB：具体工厂类B
 * <p>
 * 这个工厂类负责创建ConcreteProductB类型的对象
 *
 * @author wangguangwu
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}