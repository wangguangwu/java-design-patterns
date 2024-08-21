package com.wangguangwu.factory;

import com.wangguangwu.product.Product;

/**
 * Creator类：包含工厂方法createProduct，用于创建Product对象。
 *
 * @author wangguangwu
 */
public abstract class Creator {

    /**
     * 工厂方法
     *
     * @return 产品
     */
    public abstract Product createProduct();

    /**
     * 使用工厂方法来执行一些操作
     */
    public void someOperation() {
        Product product = createProduct();
        product.doStuff();
    }
}
