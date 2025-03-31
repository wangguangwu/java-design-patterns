package com.wangguangwu.director;

import com.wangguangwu.builder.Builder;

/**
 * 指挥者：使用构建器来创建产品
 * <p>
 * 指挥者类负责控制构建过程，它使用构建器来创建产品对象
 *
 * @author wangguangwu
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构建基本产品
     */
    public void buildBasicProduct() {
        builder.reset();
        builder.buildStepA();
        builder.buildStepB();
    }

    /**
     * 构建高级产品
     */
    public void buildPremiumProduct() {
        builder.reset();
        builder.buildStepA();
        builder.buildStepB();
        builder.buildStepZ();
    }
}
