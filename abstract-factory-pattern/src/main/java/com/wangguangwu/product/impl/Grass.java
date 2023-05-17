package com.wangguangwu.product.impl;

import com.wangguangwu.product.Plant;

/**
 * @author wangguangwu
 */
public class Grass implements Plant {
    @Override
    public void photosynthesis() {
        System.out.println("Grass photosynthesis in sunlight.");
    }
}
