package com.wangguangwu.demo1.product.impl;

import com.wangguangwu.demo1.product.DrawApi;

/**
 * @author wangguangwu
 */
public class GreenCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
