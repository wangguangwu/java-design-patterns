package com.wangguangwu.factory;

import com.wangguangwu.product.Product;
import com.wangguangwu.product.impl.ConcreteProductA;

/**
 * @author wangguangwu
 */
public class ConcreteCreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
