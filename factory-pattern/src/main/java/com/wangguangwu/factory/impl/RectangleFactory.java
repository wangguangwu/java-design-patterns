package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.ShapeFactory;
import com.wangguangwu.product.Shape;
import com.wangguangwu.product.impl.Rectangle;

/**
 * @author wangguangwu
 */
public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
