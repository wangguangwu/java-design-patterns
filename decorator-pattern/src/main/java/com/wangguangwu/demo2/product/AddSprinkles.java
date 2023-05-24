package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public class AddSprinkles extends CoffeeDecorator {

    public AddSprinkles(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public double getCost() {
        return decoratorCoffee.getCost() + 1;
    }

    @Override
    public String getIngredients() {
         return decoratorCoffee.getIngredients() + ", Sprinkles";
    }
}
