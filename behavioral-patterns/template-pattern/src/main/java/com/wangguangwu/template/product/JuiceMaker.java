package com.wangguangwu.template.product;


import com.wangguangwu.template.framework.BeverageMaker;

/**
 * 果汁制作器类
 * <p>
 * 这是果汁制作器类，实现饮料制作器的抽象方法
 *
 * @author wangguangwu
 */
public class JuiceMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("榨取新鲜果汁");
    }

    @Override
    protected void pourInCup() {
        System.out.println("将果汁倒入杯子");
    }

    @Override
    protected void addCondiments() {
        System.out.println("添加冰块");
    }
}
