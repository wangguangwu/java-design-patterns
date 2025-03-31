package com.wangguangwu.factory;

import com.wangguangwu.product.ProductA;
import com.wangguangwu.product.ProductB;

/**
 * 抽象工厂接口：定义创建产品族的接口
 * <p>
 * 抽象工厂模式（Abstract Factory Pattern）是一种创建型设计模式，它允许你创建一系列相关或依赖对象的家族，
 * 而无需指定它们具体的类。
 * <p>
 * 主要优点：
 * 1. 可以创建一系列相关的产品对象，而无需指定具体的类
 * 2. 容易添加新的产品族
 * 3. 将相关的对象创建封装在一起
 * <p>
 * 主要缺点：
 * 1. 添加新的产品等级结构困难
 * 2. 产品族扩展困难
 * <p>
 * 适用场景：
 * 1. 一个系统要独立于它的产品的创建、组合和表示时
 * 2. 一个系统要由多个产品系列中的一个来配置时
 * 3. 当你要强调一系列相关的产品对象的设计以便进行联合使用时
 *
 * @author wangguangwu
 */
public interface AbstractFactory {
    /**
     * 创建产品A
     *
     * @return 产品A的实例
     */
    ProductA createProductA();

    /**
     * 创建产品B
     *
     * @return 产品B的实例
     */
    ProductB createProductB();
}