package com.wangguangwu.builder;

/**
 * 构建器接口：定义创建产品对象的接口
 * <p>
 * 构建器模式（Builder Pattern）是一种创建型设计模式，它允许你分步骤构造复杂对象。
 * 该模式将对象的构造过程与其表示分离，使得相同的构造过程可以创建不同的表示。
 * <p>
 * 主要优点：
 * 1. 将复杂的构建过程分解成简单的步骤
 * 2. 可以创建不同的产品表示
 * 3. 代码的可读性和可维护性更好
 * <p>
 * 主要缺点：
 * 1. 代码量增加
 * 2. 系统复杂度增加
 * <p>
 * 适用场景：
 * 1. 当需要创建复杂对象时
 * 2. 当对象的创建过程需要分步骤时
 * 3. 当需要创建不同的产品表示时
 *
 * @author wangguangwu
 */
public interface Builder {
    /**
     * 重置构建器状态
     */
    void reset();

    /**
     * 构建步骤A
     */
    void buildStepA();

    /**
     * 构建步骤B
     */
    void buildStepB();

    /**
     * 构建步骤Z
     */
    void buildStepZ();
}