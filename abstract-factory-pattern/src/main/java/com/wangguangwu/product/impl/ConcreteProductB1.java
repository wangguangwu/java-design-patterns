package com.wangguangwu.product.impl;

import com.wangguangwu.product.ProductB;

/**
 * @author wangguangwu
 */
public class ConcreteProductB1 implements ProductB {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB1 is doing stuff.");
    }
}
