package com.wangguangwu.demo1;


import com.wangguangwu.demo1.product.RedShapeDecorator;
import com.wangguangwu.demo1.product.Shape;
import com.wangguangwu.demo1.product.ShapeDecorator;
import com.wangguangwu.demo1.product.impl.Circle;
import com.wangguangwu.demo1.product.impl.Rectangle;

/**
 * @author wangguangwu
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
