package com.wangguangwu.demo2;

import com.wangguangwu.demo2.product.AddMilk;
import com.wangguangwu.demo2.product.AddSprinkles;
import com.wangguangwu.demo2.product.Coffee;
import com.wangguangwu.demo2.product.impl.SimpleCoffee;

/**
 * @author wangguangwu
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + "; Ingredients: " + coffee.getIngredients());

        Coffee coffeeAddMilk = new AddMilk(coffee);
        System.out.println("Cost: " + coffeeAddMilk.getCost() + "; Ingredients: " + coffeeAddMilk.getIngredients());

        Coffee coffeeAddSprinkles = new AddSprinkles(coffee);
        System.out.println("Cost: " + coffeeAddSprinkles.getCost() + "; Ingredients: " + coffeeAddSprinkles.getIngredients());
    }
}
