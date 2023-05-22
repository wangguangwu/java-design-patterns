package com.wangguangwu.demo1.product;

/**
 * @author wangguangwu
 */
public class Circle extends Shape {

    private final int x;
    private final int y;
    private final int radius;

    public Circle(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
