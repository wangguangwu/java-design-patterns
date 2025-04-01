package com.wangguangwu.mediator.mediator;

import com.wangguangwu.mediator.aircraft.Aircraft;

/**
 * 中介者接口
 * <p>
 * 这是中介者接口，定义了中介者的基本方法
 *
 * @author wangguangwu
 */
public interface Mediator {

    /**
     * 注册飞行器
     *
     * @param aircraft 飞行器对象
     */
    void registerAircraft(Aircraft aircraft);

    /**
     * 请求降落
     *
     * @param aircraft 飞行器对象
     */
    void requestToLand(Aircraft aircraft);

    /**
     * 请求起飞
     *
     * @param aircraft 飞行器对象
     */
    void requestToTakeOff(Aircraft aircraft);

    /**
     * 通知其他飞行器
     *
     * @param aircraft 飞行器对象
     * @param message  通知消息
     */
    void notifyOtherAircraft(Aircraft aircraft, String message);
}
