package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public class CoffeeMaker extends BeverageMaker {

    @Override
    void addMainIngredient() {
        System.out.println("Adding coffee");
    }

    @Override
    void addExtras() {
        System.out.println("Adding milk and sugar");
    }
}
