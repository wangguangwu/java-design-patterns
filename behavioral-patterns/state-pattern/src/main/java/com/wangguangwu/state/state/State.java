package com.wangguangwu.state.state;

import com.wangguangwu.state.context.TrafficLight;

/**
 * 状态接口
 * <p>
 * 这是状态接口，定义了状态切换和显示的方法
 *
 * @author wangguangwu
 */
public interface State {

    /**
     * 切换到下一个状态
     *
     * @param trafficLight 交通灯对象
     */
    void next(TrafficLight trafficLight);

    /**
     * 切换到上一个状态
     *
     * @param trafficLight 交通灯对象
     */
    void previous(TrafficLight trafficLight);

    /**
     * 显示当前状态
     */
    void display();
}
