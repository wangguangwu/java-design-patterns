package com.wangguangwu.product.impl;

import com.wangguangwu.product.Shape;

/**
 * @author wangguangwu
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
