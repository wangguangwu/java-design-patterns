package com.wangguangwu.adapter;

import com.wangguangwu.adapter.product.MediaPlayer;
import com.wangguangwu.adapter.product.impl.AudioPlayer;

/**
 * 适配器模式演示类
 * <p>
 * 适配器模式（Adapter Pattern）是一种结构型设计模式，它允许不兼容的接口协同工作。
 * 适配器模式主要有两种形式：类适配器和对象适配器。
 * <p>
 * 主要优点：
 * 1. 让不兼容的接口能够一起工作
 * 2. 提供了更好的扩展性
 * 3. 符合开闭原则
 * <p>
 * 主要缺点：
 * 1. 增加了系统的复杂度
 * 2. 可能导致代码难以维护
 * <p>
 * 适用场景：
 * 1. 当需要使用现有的类，但其接口不符合需求时
 * 2. 当需要创建一个可以复用的类，该类可以与其他不兼容的类或接口一起工作时
 * 3. 当需要使用一些现有的子类，但不可能对每一个都进行子类化以匹配它们的接口时
 *
 * @author wangguangwu
 */
public class AdapterDemo {

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        // 播放MP3文件（直接支持）
        audioPlayer.play("mp3", "beyond the horizon.mp3");

        // 播放MP4文件（通过适配器支持）
        audioPlayer.play("mp4", "alone.mp4");

        // 播放VLC文件（通过适配器支持）
        audioPlayer.play("vlc", "far far away.vlc");

        // 播放不支持的格式
        audioPlayer.play("avi", "mind me.avi");
    }
}
