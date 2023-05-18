package com.wangguangwu.director;

import com.wangguangwu.builder.Builder;
import com.wangguangwu.product.Car;

/**
 * @author wangguangwu
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car createSuv() {
        return builder.setEngine("byd").setWheels(4).setColor("black").build();
    }

    public Car createSportCar() {
        return builder.setEngine("V8").setWheels(4).setColor("Red").build();
    }
}
