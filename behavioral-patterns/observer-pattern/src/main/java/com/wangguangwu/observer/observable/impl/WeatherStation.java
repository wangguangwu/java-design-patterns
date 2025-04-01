package com.wangguangwu.observer.observable.impl;

import com.wangguangwu.observer.observable.Observable;
import com.wangguangwu.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气站类
 * <p>
 * 这是天气站类，实现被观察者接口
 *
 * @author wangguangwu
 */
public class WeatherStation implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private double temperature;

    /**
     * 添加观察者
     *
     * @param observer 观察者对象
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer 观察者对象
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者
     *
     * @param temperature 温度值
     */
    @Override
    public void notifyObservers(double temperature) {
        this.temperature = temperature;
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    /**
     * 设置温度
     *
     * @param temperature 温度值
     */
    public void setTemperature(double temperature) {
        System.out.printf(
                "天气站：温度更新为 %.1f°C%n",
                temperature
        );
        notifyObservers(temperature);
    }

    /**
     * 获取温度
     *
     * @return 温度值
     */
    public double getTemperature() {
        return temperature;
    }
}