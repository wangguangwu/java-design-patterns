package com.wangguangwu;

import com.wangguangwu.prototype.impl.SubclassPrototype;

/**
 * @author wangguangwu
 */
public class Client {

    public static void main(String[] args) {
        SubclassPrototype original = new SubclassPrototype();
        original.setField1("Field 1 value");
        original.setField2("Field 2 value");

        // 克隆对象
        SubclassPrototype copy = (SubclassPrototype) original.clone();

        // 输出克隆对象的值
        System.out.println("Original Field1: " + original.getField1());
        System.out.println("Original Field2: " + original.getField2());

        System.out.println("Copy Field1: " + copy.getField1());
        System.out.println("Copy Field2: " + copy.getField2());

        // 打印克隆前后的地址
        System.out.println(original);
        System.out.println(copy);
    }
}
