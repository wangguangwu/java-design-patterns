package com.wangguangwu.state.state.impl;

import com.wangguangwu.state.context.TrafficLight;
import com.wangguangwu.state.state.State;

/**
 * 红灯状态类
 * <p>
 * 这是红灯状态类，实现状态接口
 *
 * @author wangguangwu
 */
public class RedLight implements State {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GreenLight());
    }

    @Override
    public void previous(TrafficLight trafficLight) {
        trafficLight.setState(new YellowLight());
    }

    @Override
    public void display() {
        System.out.println("红灯亮起，禁止通行");
    }
}
