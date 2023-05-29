package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public class TeaMaker extends BeverageMaker {

    @Override
    void addMainIngredient() {
        System.out.println("Adding tea leaves");
    }

    @Override
    void addExtras() {
        System.out.println("Adding lemon");
    }
}
