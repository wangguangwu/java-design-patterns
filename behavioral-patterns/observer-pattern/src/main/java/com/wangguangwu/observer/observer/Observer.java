package com.wangguangwu.observer.observer;

/**
 * 观察者接口
 * <p>
 * 这是观察者接口，定义了更新的方法
 *
 * @author wangguangwu
 */
public interface Observer {

    /**
     * 更新方法
     *
     * @param temperature 温度值
     */
    void update(double temperature);
}
