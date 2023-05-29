package com.wangguangwu.demo2.product;

/**
 * @author wangguangwu
 */
public class JuiceMaker extends BeverageMaker {

    @Override
    void addMainIngredient() {
        System.out.println("Adding juice concentrate");
    }

    @Override
    void addExtras() {
        System.out.println("Adding ice");
    }
}
