package com.wangguangwu.adapter.product.impl;

import com.wangguangwu.adapter.adapter.MediaAdapter;
import com.wangguangwu.adapter.product.MediaPlayer;

/**
 * 音频播放器
 * <p>
 * 这是客户端类，使用MediaPlayer接口
 *
 * @author wangguangwu
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}