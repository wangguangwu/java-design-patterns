package com.wangguangwu.bridge.product;

/**
 * 遥控器接口
 * <p>
 * 这是实现化角色，定义了遥控器的基本操作
 *
 * @author wangguangwu
 */
@SuppressWarnings("unused")
public interface Remote {
    /**
     * 切换电源
     */
    void power();

    /**
     * 降低音量
     */
    void volumeDown();

    /**
     * 增加音量
     */
    void volumeUp();

    /**
     * 切换到上一个频道
     */
    void channelDown();

    /**
     * 切换到下一个频道
     */
    void channelUp();
}
