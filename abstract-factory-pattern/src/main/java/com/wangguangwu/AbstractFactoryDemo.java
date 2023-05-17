package com.wangguangwu;

import com.wangguangwu.factory.EcosystemFactory;
import com.wangguangwu.factory.impl.ForestEcosystemFactory;
import com.wangguangwu.factory.impl.SavannahEcosystemFactory;
import com.wangguangwu.product.Animal;
import com.wangguangwu.product.Plant;

/**
 * @author wangguangwu
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        EcosystemFactory factory = new SavannahEcosystemFactory();
        Animal animal = factory.createAnimal();
        Plant plant = factory.createPlant();
        animal.eat();
        plant.photosynthesis();
        System.out.println("=====================");

        factory = new ForestEcosystemFactory();
        animal = factory.createAnimal();
        plant = factory.createPlant();
        animal.eat();
        plant.photosynthesis();
    }
}
