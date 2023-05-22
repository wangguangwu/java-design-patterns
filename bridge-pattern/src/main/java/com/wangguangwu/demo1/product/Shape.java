package com.wangguangwu.demo1.product;

/**
 * @author wangguangwu
 */
public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();

}
