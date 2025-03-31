package com.wangguangwu.bridge.product.impl;

import com.wangguangwu.bridge.product.Device;

/**
 * 高级遥控器实现
 * <p>
 * 这是具体实现化角色，扩展了基础遥控器的功能
 *
 * @author wangguangwu
 */
public class AdvancedRemote extends BaseRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    /**
     * 静音
     */
    public void mute() {
        System.out.println("遥控器: 静音");
        device.setVolume(0);
    }
}
