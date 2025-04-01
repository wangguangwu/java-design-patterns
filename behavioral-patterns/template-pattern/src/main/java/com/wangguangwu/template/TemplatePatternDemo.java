package com.wangguangwu.template;

import com.wangguangwu.template.framework.BeverageMaker;
import com.wangguangwu.template.product.CoffeeMaker;
import com.wangguangwu.template.product.JuiceMaker;
import com.wangguangwu.template.product.TeaMaker;

/**
 * 模板方法模式演示类
 * <p>
 * 模板方法模式（Template Method Pattern）是一种行为型设计模式，它定义了一个操作中的算法骨架，
 * 而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * <p>
 * 主要优点：
 * 1. 提供了代码复用
 * 2. 避免了代码重复
 * 3. 支持开闭原则
 * 4. 提供了代码组织结构
 * 5. 支持代码可读性
 * <p>
 * 主要缺点：
 * 1. 每个不同的实现都需要一个子类
 * 2. 子类可能影响父类
 * 3. 可能导致类膨胀
 * <p>
 * 适用场景：
 * 1. 需要封装不变的算法
 * 2. 需要扩展算法的某些步骤
 * 3. 需要提供代码复用
 * 4. 需要支持开闭原则
 *
 * @author wangguangwu
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        // 制作咖啡
        System.out.println("\n制作咖啡：");
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();

        // 制作茶
        System.out.println("\n制作茶：");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();

        // 制作果汁
        System.out.println("\n制作果汁：");
        BeverageMaker juiceMaker = new JuiceMaker();
        juiceMaker.makeBeverage();
    }
}
