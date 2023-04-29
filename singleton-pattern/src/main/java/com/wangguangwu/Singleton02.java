package com.wangguangwu;

/**
 * 懒汉式
 * <p>
 * 线程不安全
 *
 * @author wangguangwu
 */
public final class Singleton02 {

    private static Singleton02 instance;

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}