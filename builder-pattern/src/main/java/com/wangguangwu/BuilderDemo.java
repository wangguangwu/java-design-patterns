package com.wangguangwu;

import com.wangguangwu.builder.Builder;
import com.wangguangwu.builder.impl.CarBuilder;
import com.wangguangwu.director.Director;
import com.wangguangwu.product.Car;

/**
 * @author wangguangwu
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        Director director = new Director(builder);
        Car suv = director.createSuv();
        System.out.println(suv);
        System.out.println("============================");

        Car sportCar = director.createSportCar();
        System.out.println(sportCar);
    }
}
