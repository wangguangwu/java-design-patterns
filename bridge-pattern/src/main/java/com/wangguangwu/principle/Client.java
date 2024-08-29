package com.wangguangwu.principle;

import com.wangguangwu.principle.abstraction.RefinedAbstraction;
import com.wangguangwu.principle.service.Implementation;
import com.wangguangwu.principle.service.impl.ConcreteImplementationA;
import com.wangguangwu.principle.service.impl.ConcreteImplementationB;

/**
 * @author wangguangwu
 */
public class Client {

    public static void main(String[] args) {
        Implementation implementationA = new ConcreteImplementationA();
        RefinedAbstraction abstractionA = new RefinedAbstraction(implementationA);

        abstractionA.feature1();
        abstractionA.feature2();
        abstractionA.featureN();

        Implementation implementationB = new ConcreteImplementationB();
        RefinedAbstraction abstractionB = new RefinedAbstraction(implementationB);

        abstractionB.feature1();
        abstractionB.feature2();
        abstractionB.featureN();
    }
}
