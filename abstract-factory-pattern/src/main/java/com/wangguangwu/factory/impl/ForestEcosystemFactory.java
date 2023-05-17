package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.EcosystemFactory;
import com.wangguangwu.product.Animal;
import com.wangguangwu.product.Plant;
import com.wangguangwu.product.impl.Deer;
import com.wangguangwu.product.impl.Grass;

/**
 * @author wangguangwu
 */
public class ForestEcosystemFactory implements EcosystemFactory {
    @Override
    public Animal createAnimal() {
        return new Deer();
    }

    @Override
    public Plant createPlant() {
        return new Grass();
    }
}
