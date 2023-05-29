package com.wangguangwu.demo2.observer;


/**
 * @author wangguangwu
 */
public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();

}
