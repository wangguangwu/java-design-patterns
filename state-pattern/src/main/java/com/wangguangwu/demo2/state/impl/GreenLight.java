package com.wangguangwu.demo2.state.impl;

import com.wangguangwu.demo2.context.TrafficLight;
import com.wangguangwu.demo2.state.State;

/**
 * @author wangguangwu
 */
public class GreenLight implements State {

    @Override
    public void doAction(TrafficLight trafficLight) {
        System.out.println("Green Light - Go!");
        trafficLight.setState(new YellowLight());
    }
}
