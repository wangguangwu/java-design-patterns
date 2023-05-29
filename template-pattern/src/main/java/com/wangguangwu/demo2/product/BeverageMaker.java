package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public abstract class BeverageMaker {

    abstract void addMainIngredient();

    abstract void addExtras();

    void heatWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public final void makeBeverage() {
        heatWater();
        addMainIngredient();
        pourInCup();
        addExtras();
    }
}
