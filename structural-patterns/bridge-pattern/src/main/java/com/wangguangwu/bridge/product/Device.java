package com.wangguangwu.bridge.product;

/**
 * 设备接口
 * <p>
 * 这是抽象化角色，定义了设备的基本操作
 *
 * @author wangguangwu
 */
public interface Device {

    /**
     * 检查设备是否开启
     *
     * @return 设备状态
     */
    boolean isEnabled();

    /**
     * 开启设备
     */
    void enable();

    /**
     * 关闭设备
     */
    void disable();

    /**
     * 获取音量
     *
     * @return 当前音量
     */
    int getVolume();

    /**
     * 设置音量
     *
     * @param volume 新音量
     */
    void setVolume(int volume);

    /**
     * 获取频道
     *
     * @return 当前频道
     */
    int getChannel();

    /**
     * 设置频道
     *
     * @param channel 新频道
     */
    void setChannel(int channel);

    /**
     * 打印设备状态
     */
    void printStatus();
}
