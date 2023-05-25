package com.wangguangwu.demo1.product.impl;

import com.wangguangwu.demo1.product.Shape;
import lombok.Data;

/**
 * @author wangguangwu
 */
@Data
public class Circle implements Shape {

    private int x;
    private int y;
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
