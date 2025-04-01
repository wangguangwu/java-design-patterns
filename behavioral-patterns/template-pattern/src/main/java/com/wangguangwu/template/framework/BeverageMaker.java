package com.wangguangwu.template.framework;

/**
 * 饮料制作器抽象类
 * <p>
 * 这是饮料制作器抽象类，定义了饮料制作的模板方法
 *
 * @author wangguangwu
 */
public abstract class BeverageMaker {

    /**
     * 制作饮料的模板方法
     */
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 煮水
     */
    protected void boilWater() {
        System.out.println("煮水");
    }

    /**
     * 泡制
     */
    protected abstract void brew();

    /**
     * 倒入杯子
     */
    protected abstract void pourInCup();

    /**
     * 添加调料
     */
    protected abstract void addCondiments();
}
