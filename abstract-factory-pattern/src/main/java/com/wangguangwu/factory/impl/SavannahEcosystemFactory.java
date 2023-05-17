package com.wangguangwu.factory.impl;

import com.wangguangwu.factory.EcosystemFactory;
import com.wangguangwu.product.Animal;
import com.wangguangwu.product.Plant;
import com.wangguangwu.product.impl.Lion;
import com.wangguangwu.product.impl.Tree;

/**
 * @author wangguangwu
 */
public class SavannahEcosystemFactory implements EcosystemFactory {
    @Override
    public Animal createAnimal() {
        return new Lion();
    }

    @Override
    public Plant createPlant() {
        return new Tree();
    }
}
