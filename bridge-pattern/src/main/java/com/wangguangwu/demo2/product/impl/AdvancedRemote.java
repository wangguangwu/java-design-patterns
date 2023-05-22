package com.wangguangwu.demo2.product.impl;

import com.wangguangwu.demo2.product.Device;

/**
 * @author wangguangwu
 */
public class AdvancedRemote extends BaseRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
