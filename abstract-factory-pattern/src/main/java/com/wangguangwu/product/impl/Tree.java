package com.wangguangwu.product.impl;

import com.wangguangwu.product.Plant;

/**
 * @author wangguangwu
 */
public class Tree implements Plant {
    @Override
    public void photosynthesis() {
        System.out.println("Tree photosynthesis in sunlight.");
    }
}
