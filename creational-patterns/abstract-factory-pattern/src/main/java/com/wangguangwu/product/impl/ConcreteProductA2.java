package com.wangguangwu.product.impl;

import com.wangguangwu.product.ProductA;

/**
 * 具体产品A2：产品族2的产品A
 * <p>
 * 这个类实现了产品A接口，提供具体的操作实现
 *
 * @author wangguangwu
 */
public class ConcreteProductA2 implements ProductA {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA2 is doing stuff.");
    }
}
