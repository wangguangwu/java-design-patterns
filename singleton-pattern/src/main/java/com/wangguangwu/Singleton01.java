package com.wangguangwu;

/**
 * 饿汉式
 * <p>
 * 线程安全
 *
 * @author wangguangwu
 */
public final class Singleton01 {

    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}

