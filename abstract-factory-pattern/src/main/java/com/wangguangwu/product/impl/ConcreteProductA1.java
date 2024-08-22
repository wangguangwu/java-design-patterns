package com.wangguangwu.product.impl;

import com.wangguangwu.product.ProductA;

/**
 * @author wangguangwu
 */
public class ConcreteProductA1 implements ProductA {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA1 is doing stuff.");
    }
}
