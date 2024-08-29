package com.wangguangwu.principle.abstraction;

import com.wangguangwu.principle.service.Implementation;

/**
 * @author wangguangwu
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    public void featureN() {
        implementation.method3();
    }
}
