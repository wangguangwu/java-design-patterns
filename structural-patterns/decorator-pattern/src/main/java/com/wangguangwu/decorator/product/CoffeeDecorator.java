package com.wangguangwu.decorator.product;

/**
 * 咖啡装饰器
 * <p>
 * 这是抽象装饰器类，用于装饰具体的咖啡
 *
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
