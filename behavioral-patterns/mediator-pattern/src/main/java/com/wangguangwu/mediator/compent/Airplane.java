package com.wangguangwu.mediator.compent;

import com.wangguangwu.mediator.mediator.Mediator;

/**
 * 飞机类
 * <p>
 * 这是飞机类，实现飞行器接口
 *
 * @author wangguangwu
 */
public class Airplane implements Aircraft {

    private final String flightNumber;
    private final Mediator controlTower;

    /**
     * 构造函数
     *
     * @param flightNumber 飞行器编号
     * @param controlTower 空中交通管制塔
     */
    public Airplane(String flightNumber, Mediator controlTower) {
        this.flightNumber = flightNumber;
        this.controlTower = controlTower;
    }

    @Override
    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public void requestToLand() {
        controlTower.requestToLand(this);
    }

    @Override
    public void requestToTakeOff() {
        controlTower.requestToTakeOff(this);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.printf(
                "飞行器 %s 收到通知：%s%n",
                flightNumber, message
        );
    }
}
