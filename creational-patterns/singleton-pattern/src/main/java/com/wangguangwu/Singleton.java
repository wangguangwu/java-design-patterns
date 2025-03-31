package com.wangguangwu;

/**
 * 单例模式的各种实现方式
 * <p>
 * 单例模式（Singleton Pattern）是一种创建型设计模式，它保证一个类只有一个实例，
 * 并提供一个全局访问点。
 * <p>
 * 主要优点：
 * 1. 只有一个实例，节省内存
 * 2. 避免重复创建对象
 * 3. 提供全局访问点
 * <p>
 * 主要缺点：
 * 1. 违反单一职责原则
 * 2. 不利于测试
 * 3. 可能导致全局状态
 * <p>
 * 适用场景：
 * 1. 当类只能有一个实例时
 * 2. 当需要频繁创建和销毁对象时
 * 3. 当需要全局访问点时
 *
 * @author wangguangwu
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class Singleton {

    /**
     * 饿汉式（静态常量） - 最简单，线程安全
     * 特点：
     * - 线程安全
     * - 实例在类加载时创建
     * - 无法延迟加载
     */
    public static class EagerSingleton {

        private static final EagerSingleton INSTANCE = new EagerSingleton();

        private EagerSingleton() {
        }

        public static EagerSingleton getInstance() {
            return INSTANCE;
        }
    }

    /**
     * 懒汉式（线程不安全） - 简单但线程不安全
     * 特点：
     * - 实例在第一次调用时创建
     * - 线程不安全
     * - 不推荐使用
     */
    public static class LazySingleton {
        private static LazySingleton instance;

        private LazySingleton() {
        }

        public static LazySingleton getInstance() {
            if (instance == null) {
                instance = new LazySingleton();
            }
            return instance;
        }
    }

    /**
     * 懒汉式（线程安全） - 简单但性能差
     * 特点：
     * - 实例在第一次调用时创建
     * - 线程安全
     * - 性能差（每次都需要同步）
     */
    public static class SynchronizedSingleton {

        private static SynchronizedSingleton instance;

        private SynchronizedSingleton() {
        }

        public static synchronized SynchronizedSingleton getInstance() {
            if (instance == null) {
                instance = new SynchronizedSingleton();
            }
            return instance;
        }
    }

    /**
     * 双重检查锁定（DCL） - 性能好，线程安全
     * 特点：
     * - 实例在第一次调用时创建
     * - 线程安全
     * - 性能好（只在第一次创建时同步）
     * - 需要使用 volatile 关键字
     */
    public static class DoubleCheckSingleton {

        private static volatile DoubleCheckSingleton instance;

        private DoubleCheckSingleton() {
        }

        public static DoubleCheckSingleton getInstance() {
            if (instance == null) {
                synchronized (DoubleCheckSingleton.class) {
                    if (instance == null) {
                        instance = new DoubleCheckSingleton();
                    }
                }
            }
            return instance;
        }
    }

    /**
     * 静态内部类 - 推荐使用
     * 特点：
     * - 实例在第一次调用时创建
     * - 线程安全
     * - 性能好
     * - 代码简洁
     * - 可延迟加载
     */
    public static class StaticInnerClassSingleton {

        private static class SingletonHolder {
            private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
        }

        private StaticInnerClassSingleton() {
        }

        public static StaticInnerClassSingleton getInstance() {
            return SingletonHolder.INSTANCE;
        }

        /**
         * 防止序列化破坏单例
         */
        protected StaticInnerClassSingleton readResolve() {
            return SingletonHolder.INSTANCE;
        }
    }

    /**
     * 枚举 - 最安全的实现
     * 特点：
     * - 线程安全
     * - 防止反射攻击
     * - 防止序列化攻击
     * - 代码简洁
     * - 不支持延迟加载
     */
    public enum EnumSingleton {

        INSTANCE;

        public static EnumSingleton getInstance() {
            return INSTANCE;
        }
    }
}
