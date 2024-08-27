package com.wangguangwu.demo1.product.impl;

import com.wangguangwu.demo1.product.AdvancedMediaPlayer;

/**
 * @author wangguangwu
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
