package com.wangguangwu.flyweight.factory;

import com.wangguangwu.flyweight.flyweight.Car;
import com.wangguangwu.flyweight.flyweight.impl.CarImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * 汽车工厂
 * <p>
 * 这是享元工厂，负责创建和管理享元对象
 *
 * @author wangguangwu
 */
public class CarFactory {

    private static final Map<String, Car> CAR_MAP = new HashMap<>();

    /**
     * 获取汽车
     *
     * @param model 汽车型号
     * @param color 汽车颜色
     * @return 汽车对象
     */
    public static Car getCar(String model, String color) {
        String key = model + "-" + color;
        if (!CAR_MAP.containsKey(key)) {
            Car car = new CarImpl(model, color);
            CAR_MAP.put(key, car);
            System.out.printf(
                    "创建新汽车：型号：%s，颜色：%s%n",
                    model, color
            );
        }
        return CAR_MAP.get(key);
    }

    /**
     * 获取汽车数量
     *
     * @return 汽车数量
     */
    public static int getCarCount() {
        return CAR_MAP.size();
    }
}