package com.wangguangwu;

import com.wangguangwu.factory.AbstractFactory;
import com.wangguangwu.factory.impl.ConcreteFactory1;
import com.wangguangwu.factory.impl.ConcreteFactory2;
import com.wangguangwu.product.ProductA;
import com.wangguangwu.product.ProductB;

/**
 * @author wangguangwu
 */
public class Client {

    private final AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void someOperation() {
        // 使用工厂创建产品A和产品B
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();

        // 使用产品A和产品B
        productA.doStuff();
        productB.doStuff();
    }

    public static void main(String[] args) {
        // 使用 ConcreteFactory1 创建产品
        Client client1 = new Client(new ConcreteFactory1());
        client1.someOperation();

        // 使用 ConcreteFactory2 创建产品
        Client client2 = new Client(new ConcreteFactory2());
        client2.someOperation();
    }
}
