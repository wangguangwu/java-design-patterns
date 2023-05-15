package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.ShapeFactory;
import com.wangguangwu.product.Shape;
import com.wangguangwu.product.impl.Circle;

/**
 * @author wangguangwu
 */
public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
