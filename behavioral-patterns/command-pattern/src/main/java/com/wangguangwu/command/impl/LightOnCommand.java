package com.wangguangwu.command.impl;

import com.wangguangwu.command.Command;
import com.wangguangwu.product.Light;

/**
 * 灯光开启命令
 * <p>
 * 这是具体命令类，负责执行灯光开启的操作
 *
 * @author wangguangwu
 */
public class LightOnCommand implements Command {

    private final Light light;
    private boolean wasOn;

    /**
     * 构造函数
     *
     * @param light 灯光对象
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        wasOn = light.isOn();
        light.on();
        System.out.println("灯光已开启");
    }

    @Override
    public void undo() {
        if (wasOn) {
            light.on();
            System.out.println("撤销操作：灯光已开启");
        } else {
            light.off();
            System.out.println("撤销操作：灯光已关闭");
        }
    }
}
