package com.wangguangwu;

import com.wangguangwu.prototype.impl.ConcretePrototype;
import com.wangguangwu.manager.PrototypeManager;

/**
 * 原型模式演示类
 * <p>
 * 原型模式（Prototype Pattern）是一种创建型设计模式，它允许你通过复制现有对象来创建新对象，
 * 而不是通过常规的构造函数。这种模式特别适用于创建开销较大的对象。
 * <p>
 * 主要优点：
 * 1. 创建对象的代价小
 * 2. 支持对象的动态创建
 * 3. 支持对象的动态配置
 * 4. 支持对象的深拷贝
 * <p>
 * 主要缺点：
 * 1. 需要实现 Cloneable 接口
 * 2. 需要处理深拷贝问题
 * 3. 需要维护原型管理器
 * <p>
 * 适用场景：
 * 1. 创建对象的代价较大时
 * 2. 需要动态创建对象时
 * 3. 需要动态配置对象时
 * 4. 需要复制对象时
 *
 * @author wangguangwu
 */
public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setField1("原始值 1");
        prototype.setField2("原始值 2");
        prototype.setField3(42);
        prototype.setField4(true);
        prototype.setField5(new String[]{"A", "B", "C"});

        // 注册原型
        PrototypeManager.registerPrototype("prototype1", prototype);

        // 获取克隆对象
        ConcretePrototype clone1 = (ConcretePrototype) PrototypeManager.getPrototype("prototype1");
        System.out.println("原始: " + prototype);
        System.out.println("克隆 1: " + clone1);

        // 修改克隆对象的值
        clone1.setField1("修改后的值 1");
        clone1.setField2("修改后的值 2");
        clone1.setField3(100);
        clone1.setField4(false);
        clone1.getField5()[0] = "X";

        System.out.println("\n修改后:");
        System.out.println("原始: " + prototype);
        System.out.println("克隆 1: " + clone1);

        // 验证深拷贝
        System.out.println("\n验证深拷贝:");
        System.out.println("原始数组: " + String.join(", ", prototype.getField5()));
        System.out.println("克隆数组: " + String.join(", ", clone1.getField5()));

        // 创建多个克隆
        System.out.println("\n创建多个克隆:");
        ConcretePrototype clone2 = (ConcretePrototype) PrototypeManager.getPrototype("prototype1");
        ConcretePrototype clone3 = (ConcretePrototype) PrototypeManager.getPrototype("prototype1");

        System.out.println("克隆 2: " + clone2);
        System.out.println("克隆 3: " + clone3);

        // 验证对象独立性
        System.out.println("\n验证对象独立性:");
        clone2.setField1("克隆 2 的值");
        clone3.setField1("克隆 3 的值");
        clone3.setField2("原始值 3");

        System.out.println("克隆 2: " + clone2);
        System.out.println("克隆 3: " + clone3);
    }
}
