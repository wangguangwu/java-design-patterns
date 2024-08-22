package com.wangguangwu.factory;

import com.wangguangwu.product.ProductA;
import com.wangguangwu.product.ProductB;

/**
 * @author wangguangwu
 */
public interface AbstractFactory {

    ProductA createProductA();

    ProductB createProductB();

}
