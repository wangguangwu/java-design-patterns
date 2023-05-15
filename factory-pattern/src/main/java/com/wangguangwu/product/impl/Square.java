package com.wangguangwu.product.impl;

import com.wangguangwu.product.Shape;

/**
 * @author wangguangwu
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
