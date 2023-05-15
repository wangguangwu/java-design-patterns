package com.wangguangwu.factory;

import com.wangguangwu.product.Shape;

/**
 * @author wangguangwu
 */
public interface ShapeFactory {

    /**
     * 创建 shape
     *
     * @return shape
     */
    Shape createShape();

}
