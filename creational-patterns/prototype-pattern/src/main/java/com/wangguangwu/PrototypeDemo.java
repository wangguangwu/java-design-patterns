package com.wangguangwu;

import com.wangguangwu.prototype.impl.ConcretePrototype;
import com.wangguangwu.prototype.manager.PrototypeManager;

/**
 * 原型模式演示类
 * <p>
 * 这个类展示了如何使用原型模式来创建和使用对象
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
