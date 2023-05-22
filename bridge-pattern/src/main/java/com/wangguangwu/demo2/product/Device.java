package com.wangguangwu.demo2.product;

/**
 * 设备接口
 *
 * @author wangguangwu
 */
public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);

    void printStatus();

}
