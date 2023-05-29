package com.wangguangwu.demo2.observer.impl;

import com.wangguangwu.demo2.observer.Observable;

import java.util.ArrayList;
import java.util.List;

import com.wangguangwu.demo2.observer.Observer;

/**
 * @author wangguangwu
 */
public class WeatherStation implements Observable {

    private final List<Observer> observerList;
    private int temperature;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this, temperature);
        }
    }
}
