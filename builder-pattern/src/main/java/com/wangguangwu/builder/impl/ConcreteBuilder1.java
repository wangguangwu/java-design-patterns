package com.wangguangwu.builder.impl;

import com.wangguangwu.builder.Builder;
import com.wangguangwu.product.Product1;

/**
 * @author wangguangwu
 */
public class ConcreteBuilder1 implements Builder {

    private Product1 product;

    @Override
    public void reset() {
        this.product = new Product1();
    }

    @Override
    public void buildStepA() {
        product.setFeatureA("Feature A for Product1");
    }

    @Override
    public void buildStepB() {
        product.setFeatureB("Feature B for Product1");
    }

    @Override
    public void buildStepZ() {
        product.setFeatureZ("Feature Z for Product1");
    }

    public Product1 getResult() {
        return this.product;
    }
}
