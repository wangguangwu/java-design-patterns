package com.wangguangwu.demo1.context;

import com.wangguangwu.demo1.state.State;

/**
 * @author wangguangwu
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
