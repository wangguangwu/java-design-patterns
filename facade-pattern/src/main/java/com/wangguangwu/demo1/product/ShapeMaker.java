package com.wangguangwu.demo1.product;

import com.wangguangwu.demo1.product.impl.Circle;
import com.wangguangwu.demo1.product.impl.Rectangle;
import com.wangguangwu.demo1.product.impl.Square;
import lombok.Data;

/**
 * @author wangguangwu
 */
@Data
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
