package com.wangguangwu.demo1;

import com.wangguangwu.demo1.product.ShapeMaker;

/**
 * @author wangguangwu
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
