package com.wangguangwu.product.impl;

import com.wangguangwu.product.ProductB;

/**
 * 具体产品B1：产品族1的产品B
 * <p>
 * 这个类实现了产品B接口，提供具体的操作实现
 *
 * @author wangguangwu
 */
public class ConcreteProductB1 implements ProductB {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB1 is doing stuff.");
    }
}
