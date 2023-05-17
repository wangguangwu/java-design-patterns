package com.wangguangwu.product.impl;

import com.wangguangwu.product.Animal;

/**
 * @author wangguangwu
 */
public class Deer implements Animal {
    @Override
    public void eat() {
        System.out.println("Deer eats grass.");
    }
}
