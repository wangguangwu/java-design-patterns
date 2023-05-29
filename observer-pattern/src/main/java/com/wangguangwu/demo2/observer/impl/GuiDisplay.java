package com.wangguangwu.demo2.observer.impl;

import com.wangguangwu.demo2.observer.Observable;
import com.wangguangwu.demo2.observer.Observer;

/**
 * @author wangguangwu
 */
public class GuiDisplay implements Observer {

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherStation) {
            System.out.println("GUI Display: Temperature changed to " + arg + " degrees.");
        }
    }
}
