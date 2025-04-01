package com.wangguangwu.product.impl;

import com.wangguangwu.product.ProductB;

/**
 * 具体产品B2：产品族2的产品B
 * <p>
 * 这个类实现了产品B接口，提供具体的操作实现
 *
 * @author wangguangwu
 */
public class ConcreteProductB2 implements ProductB {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB2 is doing stuff.");
    }
}
