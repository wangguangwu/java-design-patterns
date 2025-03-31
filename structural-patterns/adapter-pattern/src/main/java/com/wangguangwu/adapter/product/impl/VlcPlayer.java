package com.wangguangwu.adapter.product.impl;

import com.wangguangwu.adapter.product.AdvancedMediaPlayer;

/**
 * VLC播放器实现
 * <p>
 * 这是适配者类，实现了AdvancedMediaPlayer接口
 *
 * @author wangguangwu
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // VLC播放器不支持MP4格式
    }
}
