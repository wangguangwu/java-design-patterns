package com.wangguangwu.demo2.observer.impl;

import com.wangguangwu.demo2.observer.Observable;
import com.wangguangwu.demo2.observer.Observer;

/**
 * @author wangguangwu
 */
public class AlertSystem implements Observer {

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherStation) {
            if ((int) arg > 30) {
                System.out.println("Alert System: Temperature has exceeded 30 degrees!");
            }
        }
    }
}
