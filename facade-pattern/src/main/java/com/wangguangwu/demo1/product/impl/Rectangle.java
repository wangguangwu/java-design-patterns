package com.wangguangwu.demo1.product.impl;

import com.wangguangwu.demo1.product.Shape;

/**
 * @author wangguangwu
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw");
    }
}
