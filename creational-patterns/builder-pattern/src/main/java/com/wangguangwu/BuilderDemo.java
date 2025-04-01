package com.wangguangwu;

import com.wangguangwu.builder.impl.ConcreteBuilder1;
import com.wangguangwu.builder.impl.ConcreteBuilder2;
import com.wangguangwu.director.Director;
import com.wangguangwu.product.Product1;
import com.wangguangwu.product.Product2;

/**
 * 构建器模式演示类
 * <p>
 * 构建器模式（Builder Pattern）是一种创建型设计模式，它允许你分步骤构造复杂对象。
 * 该模式将对象构造过程与它的表示分离，使得同样的构造过程可以创建不同的表示。
 * <p>
 * 主要优点：
 * 1. 将复杂的构造过程分解为简单的步骤
 * 2. 支持创建不同的产品表示
 * 3. 提供了清晰的构建过程
 * 4. 支持构造过程的灵活性
 * <p>
 * 主要缺点：
 * 1. 代码复杂度增加
 * 2. 需要额外的构建器类
 * 3. 产品类必须是可变的
 * <p>
 * 适用场景：
 * 1. 需要创建复杂对象时
 * 2. 对象的创建过程需要分步骤进行
 * 3. 需要创建不同表示的对象时
 * 4. 需要控制对象的创建过程时
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
