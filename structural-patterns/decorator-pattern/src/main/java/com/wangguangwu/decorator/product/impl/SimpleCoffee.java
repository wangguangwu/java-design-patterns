package com.wangguangwu.decorator.product.impl;

import com.wangguangwu.decorator.product.Coffee;

/**
 * 简单咖啡
 * <p>
 * 这是具体组件类，实现了基础的咖啡功能
 *
 * @author wangguangwu
 */
public class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 1.0;
    }

    @Override
    public String getIngredients() {
        return "咖啡";
    }
}
