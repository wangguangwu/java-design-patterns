package com.wangguangwu.decorator.condiments;

import com.wangguangwu.decorator.component.Coffee;
import com.wangguangwu.decorator.component.CoffeeDecorator;

/**
 * 撒糖装饰器
 * <p>
 * 这是具体装饰器类，为咖啡添加糖霜
 *
 * @author wangguangwu
 */
public class AddSprinkles extends CoffeeDecorator {

    public AddSprinkles(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.3;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", 糖霜";
    }
}
