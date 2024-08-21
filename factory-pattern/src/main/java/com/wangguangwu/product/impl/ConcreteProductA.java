package com.wangguangwu.product.impl;

import com.wangguangwu.product.Product;

/**
 * @author wangguangwu
 */
public class ConcreteProductA implements Product {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA is doing stuff.");
    }
}
