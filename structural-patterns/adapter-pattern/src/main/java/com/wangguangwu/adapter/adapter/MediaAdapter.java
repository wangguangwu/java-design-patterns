package com.wangguangwu.adapter.adapter;

import com.wangguangwu.adapter.product.AdvancedMediaPlayer;
import com.wangguangwu.adapter.product.MediaPlayer;
import com.wangguangwu.adapter.product.impl.Mp4Player;
import com.wangguangwu.adapter.product.impl.VlcPlayer;

/**
 * 媒体适配器
 * <p>
 * 这是适配器类，实现了MediaPlayer接口，并使用AdvancedMediaPlayer接口
 * 将不兼容的接口转换为目标接口
 *
 * @author wangguangwu
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * 构造函数，根据音频类型创建对应的播放器
     *
     * @param audioType 音频类型
     */
    public MediaAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
