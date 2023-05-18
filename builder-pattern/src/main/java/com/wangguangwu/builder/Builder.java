package com.wangguangwu.builder;

import com.wangguangwu.product.Car;

/**
 * @author wangguangwu
 */
public interface Builder {

    /**
     * set engine
     *
     * @param engine engine
     * @return Builder
     */
    Builder setEngine(String engine);

    /**
     * set wheels
     *
     * @param wheels wheels
     * @return Builder
     */
    Builder setWheels(int wheels);

    /**
     * set color
     *
     * @param color color
     * @return Builder
     */
    Builder setColor(String color);

    /**
     * get product
     *
     * @return car
     */
    Car build();

}
