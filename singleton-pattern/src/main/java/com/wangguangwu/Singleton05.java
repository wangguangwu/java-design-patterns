package com.wangguangwu;

/**
 * 静态内部类
 * <p>
 * 线程安全
 *
 * @author wangguangwu
 */
public final class Singleton05 {

    private static class SingletonHolder {
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    private Singleton05() {
    }

    public static Singleton05 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}