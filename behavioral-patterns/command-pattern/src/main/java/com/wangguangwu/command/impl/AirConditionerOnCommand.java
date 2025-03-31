package com.wangguangwu.command.impl;

import com.wangguangwu.command.Command;
import com.wangguangwu.product.AirConditioner;

/**
 * 空调开启命令
 * <p>
 * 这是具体命令类，负责执行空调开启的操作
 *
 * @author wangguangwu
 */
public class AirConditionerOnCommand implements Command {

    private final AirConditioner airConditioner;
    private boolean wasOn;
    private int previousTemperature;

    /**
     * 构造函数
     *
     * @param airConditioner 空调对象
     */
    public AirConditionerOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        wasOn = airConditioner.isOn();
        previousTemperature = airConditioner.getTemperature();
        airConditioner.on();
        airConditioner.setTemperature(25);
        System.out.println("空调已开启，设置温度为25度");
    }

    @Override
    public void undo() {
        if (wasOn) {
            airConditioner.on();
            airConditioner.setTemperature(previousTemperature);
            System.out.println(String.format(
                    "撤销操作：空调已开启，恢复温度为%d度",
                    previousTemperature
            ));
        } else {
            airConditioner.off();
            System.out.println("撤销操作：空调已关闭");
        }
    }
}
