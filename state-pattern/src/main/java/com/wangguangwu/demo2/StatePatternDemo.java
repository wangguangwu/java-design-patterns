package com.wangguangwu.demo2;

import com.wangguangwu.demo2.context.TrafficLight;

/**
 * @author wangguangwu
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.changeState();
        trafficLight.changeState();
        trafficLight.changeState();
        trafficLight.changeState();
    }
}
