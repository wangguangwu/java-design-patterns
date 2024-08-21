package com.wangguangwu.factory;

import com.wangguangwu.product.Product;
import com.wangguangwu.product.impl.ConcreteProductB;

/**
 * @author wangguangwu
 */
public class ConcreteCreatorB extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
