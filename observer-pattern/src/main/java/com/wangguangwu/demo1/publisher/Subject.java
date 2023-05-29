package com.wangguangwu.demo1.publisher;

import com.wangguangwu.demo1.subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguangwu
 */
public class Subject {

    private final List<Observer> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 通知所有观察者
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        observerList.forEach(Observer::update);
    }
}
