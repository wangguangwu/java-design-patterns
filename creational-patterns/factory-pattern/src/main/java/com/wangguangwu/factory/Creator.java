package com.wangguangwu.factory;

import com.wangguangwu.product.Product;

/**
 * Creator类：工厂方法设计模式的抽象类
 * <p>
 * 工厂方法模式（Factory Method Pattern）是一种创建型设计模式，它提供了创建对象的接口，
 * 但由子类决定要实例化的类是哪一个。工厂方法让类的实例化推迟到子类。
 * <p>
 * 主要优点：
 * 1. 提供了创建对象的接口，使得创建对象的代码更加通用
 * 2. 将对象的创建和使用分离，符合单一职责原则
 * 3. 客户端不需要知道具体的产品类名，只需要知道对应的工厂类
 * <p>
 * 主要缺点：
 * 1. 每增加一个产品类，就需要增加一个相应的工厂类
 * 2. 代码的复杂度会随着产品类的增加而增加
 * <p>
 * 适用场景：
 * 1. 当一个类不知道它所需要创建的对象的类时
 * 2. 当一个类希望由它的子类来指定它所创建的对象时
 * 3. 当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化时
 *
 * @author wangguangwu
 */
public abstract class Creator {

    /**
     * 工厂方法，用于创建具体的产品对象
     *
     * @return 具体的产品对象
     */
    public abstract Product createProduct();

    /**
     * 使用工厂方法来执行一些操作
     * 这个方法展示了如何使用工厂方法创建的对象
     */
    public void someOperation() {
        Product product = createProduct();
        product.doStuff();
    }
}
