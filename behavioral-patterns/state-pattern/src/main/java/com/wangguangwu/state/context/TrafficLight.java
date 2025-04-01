package com.wangguangwu.state.context;

import com.wangguangwu.state.state.State;
import com.wangguangwu.state.state.impl.RedLight;

/**
 * 交通灯类
 * <p>
 * 这是交通灯类，作为状态的上下文
 *
 * @author wangguangwu
 */
public class TrafficLight {

    private State state;

    /**
     * 构造函数
     */
    public TrafficLight() {
        this.state = new RedLight();
    }

    /**
     * 获取当前状态
     *
     * @return 当前状态
     */
    public State getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 新状态
     */
    public void setState(State state) {
        this.state = state;
        state.display();
    }

    /**
     * 切换到下一个状态
     */
    public void next() {
        state.next(this);
    }

    /**
     * 切换到上一个状态
     */
    public void previous() {
        state.previous(this);
    }
}
