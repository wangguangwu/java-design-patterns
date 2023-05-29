package com.wangguangwu.demo1.memento;

/**
 * @author wangguangwu
 */
public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
