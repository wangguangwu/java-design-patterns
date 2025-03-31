package com.wangguangwu.builder.impl;

import com.wangguangwu.builder.Builder;
import com.wangguangwu.product.Product2;

/**
 * 具体构建器2：创建产品2的构建器
 * <p>
 * 这个构建器负责创建Product2对象
 *
 * @author wangguangwu
 */
public class ConcreteBuilder2 implements Builder {

    private final Product2 product = new Product2();

    @Override
    public void reset() {
        // 重置产品状态
        product.setComponentX(null);
        product.setComponentY(null);
        product.setComponentZ(null);
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

    /**
     * 获取构建的产品
     *
     * @return 构建完成的产品
     */
    public Product2 getResult() {
        return product;
    }
}
