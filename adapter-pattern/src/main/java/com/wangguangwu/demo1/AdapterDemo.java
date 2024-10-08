package com.wangguangwu.demo1;

import com.wangguangwu.demo1.product.MediaPlayer;
import com.wangguangwu.demo1.product.impl.AudioPlayer;

/**
 * @author wangguangwu
 */
public class AdapterDemo {

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
