package com.wangguangwu.demo1.state.impl;

import com.wangguangwu.demo1.context.Context;
import com.wangguangwu.demo1.state.State;

/**
 * @author wangguangwu
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
