package com.wangguangwu.principle.service.impl;

import com.wangguangwu.principle.service.Implementation;

/**
 * @author wangguangwu
 */
public class ConcreteImplementationA implements Implementation {

    @Override
    public void method1() {
        System.out.println("ConcreteImplementationA: Executing Method1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteImplementationA: Executing Method2");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteImplementationA: Executing Method3");
    }
}
