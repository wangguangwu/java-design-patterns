package com.wangguangwu.demo2;

import com.wangguangwu.demo2.product.Car;

/**
 * @author wangguangwu
 */
public class FlyWeightPatternDemo {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.getCar("Model S", "Red");
        Car car2 = carFactory.getCar("Model 3", "Blue");
        Car car3 = carFactory.getCar("Model Y", "Red");

        car1.drive();
        car2.drive();
        car3.drive();
    }
}
