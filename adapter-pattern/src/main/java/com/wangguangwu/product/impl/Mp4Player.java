package com.wangguangwu.product.impl;

import com.wangguangwu.product.AdvancedMediaPlayer;

/**
 * @author wangguangwu
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
