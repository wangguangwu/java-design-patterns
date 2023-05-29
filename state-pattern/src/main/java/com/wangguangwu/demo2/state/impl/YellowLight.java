package com.wangguangwu.demo2.state.impl;

import com.wangguangwu.demo2.context.TrafficLight;
import com.wangguangwu.demo2.state.State;

/**
 * @author wangguangwu
 */
public class YellowLight implements State {

    @Override
    public void doAction(TrafficLight trafficLight) {
        System.out.println("Yellow Light - Ready to Stop!");
        trafficLight.setState(new RedLight());
    }
}
