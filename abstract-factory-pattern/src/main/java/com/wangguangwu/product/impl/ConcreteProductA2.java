package com.wangguangwu.product.impl;

import com.wangguangwu.product.ProductA;

/**
 * @author wangguangwu
 */
public class ConcreteProductA2 implements ProductA {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA2 is doing stuff.");
    }
}
