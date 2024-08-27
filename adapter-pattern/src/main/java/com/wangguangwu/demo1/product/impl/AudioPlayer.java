package com.wangguangwu.demo1.product.impl;

import com.wangguangwu.demo1.adapter.MediaAdapter;
import com.wangguangwu.demo1.constant.MediaConstants;
import com.wangguangwu.demo1.product.MediaPlayer;

/**
 * @author wangguangwu
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (MediaConstants.MP3.equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (MediaConstants.VLC.equalsIgnoreCase(audioType) ||
                MediaConstants.MP4.equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
