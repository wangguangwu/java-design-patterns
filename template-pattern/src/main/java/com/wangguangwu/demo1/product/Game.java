package com.wangguangwu.demo1.product;

/**
 * @author wangguangwu
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();

        startPlay();

        endPlay();
    }
}
