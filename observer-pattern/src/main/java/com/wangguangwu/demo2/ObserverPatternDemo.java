package com.wangguangwu.demo2;

import com.wangguangwu.demo2.observer.Observer;
import com.wangguangwu.demo2.observer.impl.AlertSystem;
import com.wangguangwu.demo2.observer.impl.GuiDisplay;
import com.wangguangwu.demo2.observer.impl.WeatherStation;


/**
 * @author wangguangwu
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer gui = new GuiDisplay();
        Observer alertSystem = new AlertSystem();

        station.addObserver(gui);
        station.addObserver(alertSystem);

        station.setTemperature(20);
        System.out.println("==========================");
        station.setTemperature(35);
    }
}
