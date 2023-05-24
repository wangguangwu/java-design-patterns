package com.wangguangwu.demo1.product;

/**
 * @author wangguangwu
 */
public abstract class ShapeDecorator implements Shape {

    /**
     * 被装饰的对象
     */
    protected Shape decoratedShape;

    protected ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
