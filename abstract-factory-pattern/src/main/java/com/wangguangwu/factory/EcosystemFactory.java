package com.wangguangwu.factory;

import com.wangguangwu.product.Animal;
import com.wangguangwu.product.Plant;

/**
 * 抽象工厂
 * <p>
 * 工厂的工厂
 *
 * @author wangguangwu
 */
public interface EcosystemFactory {

    /**
     * 创建动物
     *
     * @return Animal
     */
    Animal createAnimal();

    /**
     * 创建植物
     *
     * @return Plant
     */
    Plant createPlant();

}

