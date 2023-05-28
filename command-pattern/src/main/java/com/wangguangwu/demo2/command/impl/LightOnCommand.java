package com.wangguangwu.demo2.command.impl;

import com.wangguangwu.demo2.command.Command;
import com.wangguangwu.demo2.product.Light;

/**
 * @author wangguangwu
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
