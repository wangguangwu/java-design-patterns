package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public abstract class CoffeeDecorator implements Coffee {

    protected final Coffee decoratorCoffee;

    protected CoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratorCoffee = decoratorCoffee;
    }

    @Override
    public double getCost() {
        return decoratorCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratorCoffee.getIngredients();
    }
}
