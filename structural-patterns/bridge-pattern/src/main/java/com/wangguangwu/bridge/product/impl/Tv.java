package com.wangguangwu.bridge.product.impl;

import com.wangguangwu.bridge.product.Device;

/**
 * 电视机实现
 * <p>
 * 这是具体抽象化角色，实现了设备接口
 *
 * @author wangguangwu
 */
public class Tv implements Device {

    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel > 99) {
            this.channel = 99;
        } else if (channel < 1) {
            this.channel = 1;
        } else {
            this.channel = channel;
        }
    }

    @Override
    public void printStatus() {
        System.out.println("电视机状态:");
        System.out.println("  - 开启状态: " + (on ? "开启" : "关闭"));
        System.out.println("  - 音量: " + volume);
        System.out.println("  - 频道: " + channel);
    }
}
