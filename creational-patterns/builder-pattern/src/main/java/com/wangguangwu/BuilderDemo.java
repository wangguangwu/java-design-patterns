package com.wangguangwu;

import com.wangguangwu.builder.impl.ConcreteBuilder1;
import com.wangguangwu.builder.impl.ConcreteBuilder2;
import com.wangguangwu.director.Director;
import com.wangguangwu.product.Product1;
import com.wangguangwu.product.Product2;

/**
 * 构建器模式演示类
 * <p>
 * 这个类展示了如何使用构建器模式来创建和使用对象
 *
 * @author wangguangwu
 */
public class BuilderDemo {

    public static void main(String[] args) {
        // 使用构建器1创建产品
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        Director director1 = new Director(builder1);

        // 创建基本产品
        director1.buildBasicProduct();
        Product1 basicProduct1 = builder1.getResult();
        System.out.println("基本产品1: " + basicProduct1);

        // 创建高级产品
        director1.buildPremiumProduct();
        Product1 premiumProduct1 = builder1.getResult();
        System.out.println("高级产品1: " + premiumProduct1);

        // 使用构建器2创建产品
        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        Director director2 = new Director(builder2);

        // 创建基本产品
        director2.buildBasicProduct();
        Product2 basicProduct2 = builder2.getResult();
        System.out.println("基本产品2: " + basicProduct2);

        // 创建高级产品
        director2.buildPremiumProduct();
        Product2 premiumProduct2 = builder2.getResult();
        System.out.println("高级产品2: " + premiumProduct2);

        // 展示构建过程的灵活性
        System.out.println("\n自定义构建过程:");

        // 使用构建器1自定义构建
        ConcreteBuilder1 customBuilder1 = new ConcreteBuilder1();
        customBuilder1.reset();
        customBuilder1.buildStepB(); // 只构建步骤B
        Product1 customProduct1 = customBuilder1.getResult();
        System.out.println("自定义产品1: " + customProduct1);

        // 使用构建器2自定义构建
        ConcreteBuilder2 customBuilder2 = new ConcreteBuilder2();
        customBuilder2.reset();
        customBuilder2.buildStepA();
        customBuilder2.buildStepZ(); // 跳过步骤B
        Product2 customProduct2 = customBuilder2.getResult();
        System.out.println("自定义产品2: " + customProduct2);

        // 验证产品状态
        System.out.println("\n产品状态:");
        System.out.println("基本产品1具有特性Z: " + (basicProduct1.getFeatureZ() != null));
        System.out.println("高级产品1具有特性Z: " + (premiumProduct1.getFeatureZ() != null));
        System.out.println("基本产品2具有组件Y: " + (basicProduct2.getComponentY() != null));
        System.out.println("高级产品2具有组件Y: " + (premiumProduct2.getComponentY() != null));
    }
}
