package com.wangguangwu.observer.observer.impl;

import com.wangguangwu.observer.observer.Observer;

/**
 * 警报系统类
 * <p>
 * 这是警报系统类，实现观察者接口
 *
 * @author wangguangwu
 */
public class AlertSystem implements Observer {

    @Override
    public void update(double temperature) {
        if (temperature > 30) {
            System.out.printf(
                    "警报系统：温度过高！当前温度 %.1f°C%n",
                    temperature
            );
        } else if (temperature < 10) {
            System.out.printf(
                    "警报系统：温度过低！当前温度 %.1f°C%n",
                    temperature
            );
        } else {
            System.out.printf(
                    "警报系统：温度正常。当前温度 %.1f°C%n",
                    temperature
            );
        }
    }
}
