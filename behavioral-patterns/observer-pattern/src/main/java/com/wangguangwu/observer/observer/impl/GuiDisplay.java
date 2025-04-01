package com.wangguangwu.observer.observer.impl;

import com.wangguangwu.observer.observer.Observer;

/**
 * GUI显示类
 * <p>
 * 这是GUI显示类，实现观察者接口
 *
 * @author wangguangwu
 */
public class GuiDisplay implements Observer {

    @Override
    public void update(double temperature) {
        System.out.printf(
                "GUI显示：当前温度 %.1f°C%n",
                temperature
        );
    }
}
