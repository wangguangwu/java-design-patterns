package com.wangguangwu.bridge.product.impl;

import com.wangguangwu.bridge.product.Device;
import com.wangguangwu.bridge.product.Remote;

/**
 * 基础遥控器实现
 * <p>
 * 这是具体实现化角色，提供了基本的遥控器功能
 *
 * @author wangguangwu
 */
public class BaseRemote implements Remote {

    protected Device device;

    public BaseRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("遥控器: 切换电源");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("遥控器: 降低音量");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("遥控器: 增加音量");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("遥控器: 切换到上一个频道");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("遥控器: 切换到下一个频道");
        device.setChannel(device.getChannel() + 1);
    }
}
