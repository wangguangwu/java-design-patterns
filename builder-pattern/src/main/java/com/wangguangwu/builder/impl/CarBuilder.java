package com.wangguangwu.builder.impl;

import com.wangguangwu.builder.Builder;
import com.wangguangwu.product.Car;

/**
 * @author wangguangwu
 */
public class CarBuilder implements Builder {

    private String engine;
    private int wheels;
    private String color;

    @Override
    public Builder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car build() {
        return new Car(engine, wheels, color);
    }
}
