package com.wangguangwu.principle.abstraction;

import com.wangguangwu.principle.service.Implementation;

/**
 * @author wangguangwu
 */
public class Abstraction {

    protected final Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void feature1() {
        implementation.method1();
    }

    public void feature2() {
        implementation.method2();
    }
}
