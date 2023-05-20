package com.wangguangwu.demo1;

import com.wangguangwu.demo1.cache.ShapeCache;
import com.wangguangwu.demo1.product.Shape;

/**
 * @author wangguangwu
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

        // change cloned product, compare with original product
        System.out.println("=====================================");
        clonedShape.setType("clonedShape");
        System.out.println(clonedShape.getType());
        System.out.println(ShapeCache.getShape("1").getType());
    }
}
