package com.wangguangwu;

/**
 * 双检锁
 * <p>
 * 线程安全
 *
 * @author wangguangwu
 */
public final class Singleton04 {

    /**
     * 使用 volatile 避免多线程场景下的指令重排序
     */
    private static volatile Singleton04 instance;

    private Singleton04() {
    }

    public static Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class) {
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}
