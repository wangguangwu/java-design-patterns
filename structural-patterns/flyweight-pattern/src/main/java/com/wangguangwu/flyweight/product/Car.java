package com.wangguangwu.flyweight.product;

/**
 * 汽车接口
 * <p>
 * 这是享元接口，定义了所有享元对象的公共接口
 *
 * @author wangguangwu
 */
public interface Car {

    /**
     * 驾驶汽车
     *
     * @param speed    速度
     * @param location 位置
     */
    void drive(int speed, String location);
}
