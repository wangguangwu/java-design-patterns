package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.ShapeFactory;
import com.wangguangwu.product.Shape;
import com.wangguangwu.product.impl.Square;

/**
 * @author wangguangwu
 */
public class SquareFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Square();
    }
}
