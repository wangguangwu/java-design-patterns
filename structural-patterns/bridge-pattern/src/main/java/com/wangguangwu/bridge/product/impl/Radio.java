package com.wangguangwu.bridge.product.impl;

import com.wangguangwu.bridge.product.Device;

/**
 * 收音机实现
 * <p>
 * 这是具体抽象化角色，实现了设备接口
 *
 * @author wangguangwu
 */
public class Radio implements Device {

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
        } else {
            this.volume = Math.max(volume, 0);
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
        } else {
            this.channel = Math.max(channel, 1);
        }
    }

    @Override
    public void printStatus() {
        System.out.println("收音机状态:");
        System.out.println("  - 开启状态: " + (on ? "开启" : "关闭"));
        System.out.println("  - 音量: " + volume);
        System.out.println("  - 频道: " + channel);
    }
}

