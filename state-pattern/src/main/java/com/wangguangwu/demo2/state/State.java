package com.wangguangwu.demo2.state;

import com.wangguangwu.demo2.context.TrafficLight;

/**
 * @author wangguangwu
 */
public interface State {

    void doAction(TrafficLight trafficLight);

}
