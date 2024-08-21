package com.wangguangwu.product.impl;

import com.wangguangwu.product.Product;

/**
 * @author wangguangwu
 */
public class ConcreteProductB implements Product {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB is doing stuff.");
    }
}
