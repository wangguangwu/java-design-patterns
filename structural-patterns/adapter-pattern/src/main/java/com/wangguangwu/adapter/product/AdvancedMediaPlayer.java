package com.wangguangwu.adapter.product;

/**
 * 高级媒体播放器接口
 * <p>
 * 这是适配者接口，定义了需要适配的接口
 *
 * @author wangguangwu
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放VLC格式文件
     *
     * @param fileName 文件名
     */
    void playVlc(String fileName);

    /**
     * 播放MP4格式文件
     *
     * @param fileName 文件名
     */
    void playMp4(String fileName);
}
