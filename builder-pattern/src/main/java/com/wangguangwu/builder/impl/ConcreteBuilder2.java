package com.wangguangwu.builder.impl;

import com.wangguangwu.builder.Builder;
import com.wangguangwu.product.Product2;

/**
 * @author wangguangwu
 */
public class ConcreteBuilder2 implements Builder {

    private Product2 product;

    @Override
    public void reset() {
        this.product = new Product2();
    }

    @Override
    public void buildStepA() {
        product.setComponentX("Component X for Product2");
    }

    @Override
    public void buildStepB() {
        product.setComponentY("Component Y for Product2");
    }

    @Override
    public void buildStepZ() {
        product.setComponentZ("Component Z for Product2");
    }

    public Product2 getResult() {
        return this.product;
    }
}
