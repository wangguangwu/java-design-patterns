package com.wangguangwu;

/**
 * 懒汉式
 * <p>
 * 线程安全
 *
 * @author wangguangwu
 */
public final class Singleton03 {

    private static Singleton03 instance;

    private Singleton03() {
    }

    public static synchronized Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}

