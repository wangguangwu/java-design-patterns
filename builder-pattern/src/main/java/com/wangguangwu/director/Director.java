package com.wangguangwu.director;

import com.wangguangwu.builder.Builder;
import com.wangguangwu.product.Car;

/**
 * @author wangguangwu
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void make(String type) {
        builder.reset();
        if ("simple".equals(type)) {
            builder.buildStepA();
        } else {
            builder.buildStepB();
            builder.buildStepZ();
        }
    }
}
