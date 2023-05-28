package com.wangguangwu.demo2.command.impl;

import com.wangguangwu.demo2.command.Command;
import com.wangguangwu.demo2.product.AirConditioner;

/**
 * @author wangguangwu
 */
public class AirConditionerOnCommand implements Command {

    private final AirConditioner airConditioner;

    public AirConditionerOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.on();
    }

    @Override
    public void undo() {
        airConditioner.off();
    }
}
