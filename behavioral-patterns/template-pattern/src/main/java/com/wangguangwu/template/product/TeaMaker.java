package com.wangguangwu.template.product;

import com.wangguangwu.template.framework.BeverageMaker;

/**
 * 茶制作器类
 * <p>
 * 这是茶制作器类，实现饮料制作器的抽象方法
 *
 * @author wangguangwu
 */
public class TeaMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡茶叶");
    }

    @Override
    protected void pourInCup() {
        System.out.println("将茶倒入杯子");
    }

    @Override
    protected void addCondiments() {
        System.out.println("添加柠檬");
    }
}