package com.wangguangwu.demo2;

import com.wangguangwu.demo2.product.Car;
import com.wangguangwu.demo2.product.impl.SpecificCar;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangguangwu
 */
public class CarFactory {

    private static final Map<String, Car> CARS = new HashMap<>();

    public Car getCar(String model, String color) {
        String key = model + "-" + color;
        Car car = CARS.get(key);

        if (car == null) {
            car = new SpecificCar(model, color);
            CARS.put(key, car);
            System.out.println("Creating a " + color + " " + model);
        }
        return car;
    }
}
