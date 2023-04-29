package com.wangguangwu;

/**
 * 枚举类
 * <p>
 * 线程安全
 *
 * @author wangguangwu
 */
public enum Singleton06 {

    INSTANCE;

    public static Singleton06 getInstance() {
        return INSTANCE;
    }
}
