package com.wangguangwu.decorator.condiments;

import com.wangguangwu.decorator.component.Coffee;
import com.wangguangwu.decorator.component.CoffeeDecorator;

/**
 * 加牛奶装饰器
 * <p>
 * 这是具体装饰器类，为咖啡添加牛奶
 *
 * @author wangguangwu
 */
public class AddMilk extends CoffeeDecorator {

    public AddMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", 牛奶";
    }
}