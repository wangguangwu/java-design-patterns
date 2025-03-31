package com.wangguangwu.product.impl;

import com.wangguangwu.product.Product;

/**
 * ConcreteProductB：具体产品类B
 * <p>
 * 这个类实现了Product接口，提供具体的操作实现
 *
 * @author wangguangwu
 */
public class ConcreteProductB implements Product {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB is doing stuff.");
    }
}
