package com.wangguangwu.builder.impl;

import com.wangguangwu.builder.Builder;
import com.wangguangwu.product.Product1;

/**
 * 具体构建器1：创建产品1的构建器
 * <p>
 * 这个构建器负责创建Product1对象
 *
 * @author wangguangwu
 */
public class ConcreteBuilder1 implements Builder {

    private final Product1 product = new Product1();

    @Override
    public void reset() {
        // 重置产品状态
        product.setFeatureA(null);
        product.setFeatureB(null);
        product.setFeatureZ(null);
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

    /**
     * 获取构建的产品
     *
     * @return 构建完成的产品
     */
    public Product1 getResult() {
        return product;
    }
}
