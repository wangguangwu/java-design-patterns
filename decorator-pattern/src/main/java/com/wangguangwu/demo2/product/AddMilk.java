package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public class AddMilk extends CoffeeDecorator {

    public AddMilk(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public double getCost() {
        return decoratorCoffee.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return decoratorCoffee.getIngredients() + ", Milk";
    }
}
