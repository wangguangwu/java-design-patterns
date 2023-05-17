package com.wangguangwu.product.impl;

import com.wangguangwu.product.Animal;

/**
 * @author wangguangwu
 */
public class Lion implements Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }
}
