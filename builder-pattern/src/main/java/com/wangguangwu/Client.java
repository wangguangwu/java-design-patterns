package com.wangguangwu;

import com.wangguangwu.builder.impl.ConcreteBuilder1;
import com.wangguangwu.builder.impl.ConcreteBuilder2;
import com.wangguangwu.director.Director;
import com.wangguangwu.product.Product1;
import com.wangguangwu.product.Product2;

/**
 * @author wangguangwu
 */
public class Client {

    public static void main(String[] args) {
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        Director director1 = new Director(builder1);
        director1.make("simple");
        Product1 product1 = builder1.getResult();
        System.out.println(product1);

        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        Director director2 = new Director(builder1);
        director2.make("complex");
        Product2 product2 = builder2.getResult();
        System.out.println(product2);
    }
}
