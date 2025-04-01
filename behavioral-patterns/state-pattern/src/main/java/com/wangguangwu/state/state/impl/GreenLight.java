package com.wangguangwu.state.state.impl;

import com.wangguangwu.state.context.TrafficLight;
import com.wangguangwu.state.state.State;

/**
 * 绿灯状态类
 * <p>
 * 这是绿灯状态类，实现状态接口
 *
 * @author wangguangwu
 */
public class GreenLight implements State {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowLight());
    }

    @Override
    public void previous(TrafficLight trafficLight) {
        trafficLight.setState(new RedLight());
    }

    @Override
    public void display() {
        System.out.println("绿灯亮起，可以通行");
    }
}
