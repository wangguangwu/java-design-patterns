package com.wangguangwu.demo2.product.impl;

import com.wangguangwu.demo2.product.Car;

/**
 * @author wangguangwu
 */
public class SpecificCar implements Car {

    private final String model;
    private final String color;

    public SpecificCar(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + color + " " + model);
    }
}
