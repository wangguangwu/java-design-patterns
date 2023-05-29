package com.wangguangwu.demo2.state.impl;

import com.wangguangwu.demo2.context.TrafficLight;
import com.wangguangwu.demo2.state.State;

/**
 * @author wangguangwu
 */
public class RedLight implements State {

    @Override
    public void doAction(TrafficLight trafficLight) {
        System.out.println("Red Light - Stop!");
        trafficLight.setState(new GreenLight());
    }
}
