package com.wangguangwu.adapter.product;

/**
 * 媒体播放器接口
 * <p>
 * 这是目标接口，定义了客户端需要的接口
 *
 * @author wangguangwu
 */
public interface MediaPlayer {

    /**
     * 播放音频文件
     *
     * @param audioType 音频类型
     * @param fileName  文件名
     */
    void play(String audioType, String fileName);
}
