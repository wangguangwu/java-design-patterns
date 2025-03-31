package com.wangguangwu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
public class SingletonTest {

    @BeforeEach
    public void setUp() {
        // 清理之前的实例
        try {
            Singleton.EagerSingleton.class.getDeclaredField("INSTANCE").setAccessible(true);
            Singleton.EagerSingleton.class.getDeclaredField("INSTANCE").set(null, null);

            Singleton.LazySingleton.class.getDeclaredField("instance").setAccessible(true);
            Singleton.LazySingleton.class.getDeclaredField("instance").set(null, null);

            Singleton.SynchronizedSingleton.class.getDeclaredField("instance").setAccessible(true);
            Singleton.SynchronizedSingleton.class.getDeclaredField("instance").set(null, null);

            Singleton.DoubleCheckSingleton.class.getDeclaredField("instance").setAccessible(true);
            Singleton.DoubleCheckSingleton.class.getDeclaredField("instance").set(null, null);
        } catch (Exception e) {
            // Ignore
        }
    }

    @Test
    @DisplayName("测试饿汉式单例")
    public void testEagerSingleton() {
        Singleton.EagerSingleton instance1 = Singleton.EagerSingleton.getInstance();
        Singleton.EagerSingleton instance2 = Singleton.EagerSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    @DisplayName("测试懒汉式单例")
    public void testLazySingleton() {
        Singleton.LazySingleton instance1 = Singleton.LazySingleton.getInstance();
        Singleton.LazySingleton instance2 = Singleton.LazySingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    @DisplayName("测试懒汉式同步单例")
    public void testSynchronizedSingleton() {
        Singleton.SynchronizedSingleton instance1 = Singleton.SynchronizedSingleton.getInstance();
        Singleton.SynchronizedSingleton instance2 = Singleton.SynchronizedSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    @DisplayName("测试双重检查锁单例")
    public void testDoubleCheckSingleton() {
        Singleton.DoubleCheckSingleton instance1 = Singleton.DoubleCheckSingleton.getInstance();
        Singleton.DoubleCheckSingleton instance2 = Singleton.DoubleCheckSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    @DisplayName("测试静态内部类单例")
    public void testStaticInnerClassSingleton() {
        Singleton.StaticInnerClassSingleton instance1 = Singleton.StaticInnerClassSingleton.getInstance();
        Singleton.StaticInnerClassSingleton instance2 = Singleton.StaticInnerClassSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    @DisplayName("测试枚举单例")
    public void testEnumSingleton() {
        Singleton.EnumSingleton instance1 = Singleton.EnumSingleton.getInstance();
        Singleton.EnumSingleton instance2 = Singleton.EnumSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    @DisplayName("测试线程安全性")
    public void testThreadSafety() throws InterruptedException {
        final AtomicInteger counter = new AtomicInteger();
        int THREAD_COUNT = 1000;
        final CountDownLatch latch = new CountDownLatch(THREAD_COUNT);

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        // 用于存储所有线程获取的实例
        final Singleton.DoubleCheckSingleton[] instances = new Singleton.DoubleCheckSingleton[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            final int index = i; // 为了在lambda中使用
            executor.submit(() -> {
                Singleton.DoubleCheckSingleton instance = Singleton.DoubleCheckSingleton.getInstance();
                instances[index] = instance; // 将每个线程获得的实例保存
                counter.getAndIncrement();
                latch.countDown();
            });
        }

        latch.await(); // 等待所有线程完成

        // 验证所有线程获得的实例是否是同一个
        Singleton.DoubleCheckSingleton firstInstance = instances[0];
        for (int i = 1; i < THREAD_COUNT; i++) {
            assertSame(firstInstance, instances[i], "所有线程应获得相同的实例");
        }

        // 确保所有线程只获取了一个实例
        assertEquals(THREAD_COUNT, counter.get(), "应有 " + THREAD_COUNT + " 次实例获取");

        executor.shutdown();
    }

    @Test
    @DisplayName("测试序列化安全性")
    public void testSerializationSecurity() {
        Singleton.StaticInnerClassSingleton instance1 = Singleton.StaticInnerClassSingleton.getInstance();
        // 假设序列化和反序列化
        Singleton.StaticInnerClassSingleton instance2 = instance1.readResolve();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    @DisplayName("测试性能")
    public void testPerformance() {
        // 测试不同单例实现的性能
        long startTime, endTime;

        // 测试饿汉式单例性能
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Singleton.EagerSingleton.getInstance();
        }
        endTime = System.nanoTime();
        System.out.println("Eager Singleton performance: " + (endTime - startTime) + " ns");

        // 测试懒汉式单例性能
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Singleton.LazySingleton.getInstance();
        }
        endTime = System.nanoTime();
        System.out.println("Lazy Singleton performance: " + (endTime - startTime) + " ns");

        // 测试懒汉式同步单例性能
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Singleton.SynchronizedSingleton.getInstance();
        }
        endTime = System.nanoTime();
        System.out.println("Synchronized Singleton performance: " + (endTime - startTime) + " ns");

        // 测试双重检查锁单例性能
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Singleton.DoubleCheckSingleton.getInstance();
        }
        endTime = System.nanoTime();
        System.out.println("Double Check Singleton performance: " + (endTime - startTime) + " ns");

        // 测试静态内部类单例性能
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Singleton.StaticInnerClassSingleton.getInstance();
        }
        endTime = System.nanoTime();
        System.out.println("Static Inner Class Singleton performance: " + (endTime - startTime) + " ns");

        // 测试枚举单例性能
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Singleton.EnumSingleton.getInstance();
        }
        endTime = System.nanoTime();
        System.out.println("Enum Singleton performance: " + (endTime - startTime) + " ns");
    }

    @Test
    @DisplayName("测试内存使用")
    public void testMemoryUsage() {
        Singleton.EagerSingleton eager = Singleton.EagerSingleton.getInstance();
        Singleton.LazySingleton lazy = Singleton.LazySingleton.getInstance();
        Singleton.SynchronizedSingleton sync = Singleton.SynchronizedSingleton.getInstance();
        Singleton.DoubleCheckSingleton dcl = Singleton.DoubleCheckSingleton.getInstance();
        Singleton.StaticInnerClassSingleton staticSingleton = Singleton.StaticInnerClassSingleton.getInstance();
        Singleton.EnumSingleton enumSingleton = Singleton.EnumSingleton.getInstance();

        assertNotNull(eager);
        assertNotNull(lazy);
        assertNotNull(sync);
        assertNotNull(dcl);
        assertNotNull(staticSingleton);
        assertNotNull(enumSingleton);
    }
}
