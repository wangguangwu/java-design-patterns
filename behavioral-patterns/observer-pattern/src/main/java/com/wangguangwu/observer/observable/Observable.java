package com.wangguangwu.observer.observable;

import com.wangguangwu.observer.observer.Observer;

/**
 * 被观察者接口
 * <p>
 * 这是被观察者接口，定义了观察者管理的方法
 *
 * @author wangguangwu
 */
public interface Observable {

    /**
     * 添加观察者
     *
     * @param observer 观察者对象
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer 观察者对象
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     *
     * @param temperature 温度值
     */
    void notifyObservers(double temperature);
}

