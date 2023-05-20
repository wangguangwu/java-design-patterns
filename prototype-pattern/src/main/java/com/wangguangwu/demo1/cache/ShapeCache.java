package com.wangguangwu.demo1.cache;

import com.wangguangwu.demo1.product.Circle;
import com.wangguangwu.demo1.product.Rectangle;
import com.wangguangwu.demo1.product.Shape;
import com.wangguangwu.demo1.product.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangguangwu
 */
public final class ShapeCache {

    private static final Map<String, Shape> SHAPE_MAP = new HashMap<>();

    private ShapeCache() {
    }

    public static Shape getShape(String shapeId) {
        return SHAPE_MAP.get(shapeId).clone();
    }

    /**
     * 模拟数据库查询操作
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        SHAPE_MAP.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        SHAPE_MAP.put(rectangle.getId(), rectangle);
    }
}
