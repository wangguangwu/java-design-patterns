package com.wangguangwu;

import com.wangguangwu.factory.ConcreteCreatorA;
import com.wangguangwu.factory.ConcreteCreatorB;
import com.wangguangwu.factory.Creator;

/**
 * @author wangguangwu
 */
public class Client {

    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();
    }
}
