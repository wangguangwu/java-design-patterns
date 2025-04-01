package com.wangguangwu.mediator.aircraft;

/**
 * 飞行器接口
 * <p>
 * 这是飞行器接口，定义了飞行器的基本方法
 *
 * @author wangguangwu
 */
public interface Aircraft {

    /**
     * 获取飞行器编号
     *
     * @return 飞行器编号
     */
    String getFlightNumber();

    /**
     * 请求降落
     */
    void requestToLand();

    /**
     * 请求起飞
     */
    void requestToTakeOff();

    /**
     * 接收通知
     *
     * @param message 通知消息
     */
    void receiveNotification(String message);
}

