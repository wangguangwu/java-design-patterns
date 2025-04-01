package com.wangguangwu.product.impl;

import com.wangguangwu.product.Product;

/**
 * ConcreteProductA：具体产品类A
 * <p>
 * 这个类实现了Product接口，提供具体的操作实现
 *
 * @author wangguangwu
 */
public class ConcreteProductA implements Product {

    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA is doing stuff.");
    }
}
