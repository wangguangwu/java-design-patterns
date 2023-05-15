package com.wangguangwu;

import com.wangguangwu.factory.ShapeFactory;
import com.wangguangwu.factory.impl.CircleFactory;
import com.wangguangwu.factory.impl.RectangleFactory;
import com.wangguangwu.factory.impl.SquareFactory;
import com.wangguangwu.product.Shape;

/**
 * @author wangguangwu
 */
public class FactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new SquareFactory();
        Shape shape = shapeFactory.createShape();
        shape.draw();

        shapeFactory = new CircleFactory();
        shape = shapeFactory.createShape();
        shape.draw();

        shapeFactory = new RectangleFactory();
        shape = shapeFactory.createShape();
        shape.draw();
    }
}
