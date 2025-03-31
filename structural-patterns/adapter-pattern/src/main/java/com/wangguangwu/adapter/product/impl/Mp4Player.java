package com.wangguangwu.adapter.product.impl;

import com.wangguangwu.adapter.product.AdvancedMediaPlayer;

/**
 * MP4播放器实现
 * <p>
 * 这是适配者类，实现了AdvancedMediaPlayer接口
 *
 * @author wangguangwu
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // MP4播放器不支持VLC格式
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
