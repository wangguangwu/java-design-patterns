package com.wangguangwu.demo1;

import com.wangguangwu.demo1.product.Circle;
import com.wangguangwu.demo1.product.Shape;
import com.wangguangwu.demo1.product.impl.GreenCircle;
import com.wangguangwu.demo1.product.impl.RedCircle;

/**
 * @author wangguangwu
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
        Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}
