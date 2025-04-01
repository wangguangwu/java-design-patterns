package com.wangguangwu.template.product;

import com.wangguangwu.template.framework.BeverageMaker;

/**
 * 咖啡制作器类
 * <p>
 * 这是咖啡制作器类，实现饮料制作器的抽象方法
 *
 * @author wangguangwu
 */
public class CoffeeMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void pourInCup() {
        System.out.println("将咖啡倒入杯子");
    }

    @Override
    protected void addCondiments() {
        System.out.println("添加糖和奶");
    }
}