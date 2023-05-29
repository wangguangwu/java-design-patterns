package com.wangguangwu.demo2.context;

import com.wangguangwu.demo2.state.State;
import com.wangguangwu.demo2.state.impl.RedLight;

/**
 * @author wangguangwu
 */
public class TrafficLight {

    private State state;

    public TrafficLight() {
        state = new RedLight();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        state.doAction(this);
    }
}
