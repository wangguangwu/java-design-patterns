package com.wangguangwu.demo2;

import com.wangguangwu.demo2.product.BeverageMaker;
import com.wangguangwu.demo2.product.CoffeeMaker;
import com.wangguangwu.demo2.product.JuiceMaker;
import com.wangguangwu.demo2.product.TeaMaker;

/**
 * @author wangguangwu
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        BeverageMaker beverageMaker = new CoffeeMaker();
        beverageMaker.makeBeverage();

        System.out.println("======================");
        beverageMaker = new TeaMaker();
        beverageMaker.makeBeverage();

        System.out.println("======================");
        beverageMaker = new JuiceMaker();
        beverageMaker.makeBeverage();
    }
}
