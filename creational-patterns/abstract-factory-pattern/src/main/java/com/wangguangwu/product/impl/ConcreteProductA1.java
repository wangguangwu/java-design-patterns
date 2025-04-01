package com.wangguangwu.product.impl;

import com.wangguangwu.product.ProductA;

/**
 * 具体产品A1：产品族1的产品A
 * <p>
 * 这个类实现了产品A接口，提供具体的操作实现
 *
 * @author wangguangwu
 */
public class ConcreteProductA1 implements ProductA {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA1 is doing stuff.");
    }
}