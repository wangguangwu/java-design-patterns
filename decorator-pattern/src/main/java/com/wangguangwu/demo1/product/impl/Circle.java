package com.wangguangwu.demo1.product.impl;


import com.wangguangwu.demo1.product.Shape;

/**
 * @author wangguangwu
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
