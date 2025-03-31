package com.wangguangwu.decorator;

import com.wangguangwu.decorator.product.condiments.AddMilk;
import com.wangguangwu.decorator.product.condiments.AddSprinkles;
import com.wangguangwu.decorator.product.Coffee;
import com.wangguangwu.decorator.product.impl.SimpleCoffee;

/**
 * 装饰器模式演示类
 * <p>
 * 装饰器模式（Decorator Pattern）是一种结构型设计模式，它允许在运行时动态地向对象添加职责。
 * <p>
 * 主要优点：
 * 1. 提供了比继承更灵活的替代方案
 * 2. 可以动态添加或删除职责
 * 3. 可以组合多个装饰器
 * <p>
 * 主要缺点：
 * 1. 可能导致代码复杂性增加
 * 2. 可能导致性能问题
 * 3. 可能导致调试困难
 * <p>
 * 适用场景：
 * 1. 需要在运行时动态添加职责
 * 2. 需要为对象添加多个职责
 * 3. 需要避免使用继承的复杂性
 *
 * @author wangguangwu
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        // 创建基础咖啡
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("基础咖啡:");
        System.out.println("  - 价格: " + simpleCoffee.getCost());
        System.out.println("  - 配料: " + simpleCoffee.getIngredients());
        System.out.println("=======================");

        // 添加牛奶
        Coffee coffeeWithMilk = new AddMilk(simpleCoffee);
        System.out.println("加牛奶咖啡:");
        System.out.println("  - 价格: " + coffeeWithMilk.getCost());
        System.out.println("  - 配料: " + coffeeWithMilk.getIngredients());
        System.out.println("=======================");

        // 添加糖霜
        Coffee coffeeWithSprinkles = new AddSprinkles(simpleCoffee);
        System.out.println("加糖霜咖啡:");
        System.out.println("  - 价格: " + coffeeWithSprinkles.getCost());
        System.out.println("  - 配料: " + coffeeWithSprinkles.getIngredients());
        System.out.println("=======================");

        // 添加牛奶和糖霜
        Coffee coffeeWithMilkAndSprinkles = new AddSprinkles(new AddMilk(simpleCoffee));
        System.out.println("加牛奶和糖霜咖啡:");
        System.out.println("  - 价格: " + coffeeWithMilkAndSprinkles.getCost());
        System.out.println("  - 配料: " + coffeeWithMilkAndSprinkles.getIngredients());
    }
}
