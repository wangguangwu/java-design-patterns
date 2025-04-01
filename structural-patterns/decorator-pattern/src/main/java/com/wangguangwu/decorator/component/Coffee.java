package com.wangguangwu.decorator.component;

/**
 * 咖啡接口
 * <p>
 * 这是抽象组件接口，定义了所有咖啡的基本操作
 *
 * @author wangguangwu
 */
public interface Coffee {

    /**
     * 获取咖啡价格
     *
     * @return 咖啡价格
     */
    double getCost();

    /**
     * 获取咖啡配料
     *
     * @return 咖啡配料列表
     */
    String getIngredients();
}
