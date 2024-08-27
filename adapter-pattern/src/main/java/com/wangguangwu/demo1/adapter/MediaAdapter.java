package com.wangguangwu.demo1.adapter;

import com.wangguangwu.demo1.constant.MediaConstants;
import com.wangguangwu.demo1.product.AdvancedMediaPlayer;
import com.wangguangwu.demo1.product.MediaPlayer;
import com.wangguangwu.demo1.product.impl.Mp4Player;
import com.wangguangwu.demo1.product.impl.VlcPlayer;

/**
 * @author wangguangwu
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (MediaConstants.VLC.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (MediaConstants.MP4.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (MediaConstants.VLC.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (MediaConstants.MP4.equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
