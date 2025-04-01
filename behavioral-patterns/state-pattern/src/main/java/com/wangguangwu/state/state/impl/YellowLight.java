package com.wangguangwu.state.state.impl;

import com.wangguangwu.state.context.TrafficLight;
import com.wangguangwu.state.state.State;

/**
 * 黄灯状态类
 * <p>
 * 这是黄灯状态类，实现状态接口
 *
 * @author wangguangwu
 */
public class YellowLight implements State {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RedLight());
    }

    @Override
    public void previous(TrafficLight trafficLight) {
        trafficLight.setState(new GreenLight());
    }

    @Override
    public void display() {
        System.out.println("黄灯亮起，即将变红");
    }
}
