package com.wangguangwu;

import org.junit.jupiter.api.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * @author wangguangwu
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("测试多线程环境下取出对象是否是同一个")
class SingletonTest {

    private static final int NUM_THREADS = 20;

    private static ExecutorService executorService;

    @BeforeAll
    public static void init() {
        // 创建一个包含 20 个线程的线程池
        executorService = Executors.newFixedThreadPool(NUM_THREADS);
    }

    @AfterAll
    public static void end() {
        executorService.shutdownNow();
    }

    @Test
    @Order(1)
    @DisplayName("Singleton01：饿汉式-线程安全")
    void testSingleton01() throws InterruptedException {
        Set<Singleton01> instances = execute(Singleton01.class);
        Assertions.assertEquals(1, instances.size(), "所有线程获取的 Singleton01 实例应该相同");
    }

    @Test
    @Order(2)
    @DisplayName("Singleton02：懒汉式-线程不安全")
    void testSingleton02() throws InterruptedException {
        Set<Singleton02> instances = execute(Singleton02.class);
        Assertions.assertTrue(instances.size() >= 1, "所有线程应该获取多个 Singleton02 实例");
    }

    @Test
    @Order(3)
    @DisplayName("Singleton03：懒汉式-线程安全")
    void testSingleton03() throws InterruptedException {
        Set<Singleton03> instances = execute(Singleton03.class);
        Assertions.assertEquals(1, instances.size(), "所有线程获取的 Singleton03 实例应该相同");
    }

    @Test
    @Order(4)
    @DisplayName("Singleton04：双检锁-线程安全")
    void testSingleton04() throws InterruptedException {
        Set<Singleton04> instances = execute(Singleton04.class);
        Assertions.assertEquals(1, instances.size(), "所有线程获取的 Singleton04 实例应该相同");
    }

    @Test
    @Order(5)
    @DisplayName("Singleton05：静态内部类-线程安全")
    void testSingleton05() throws InterruptedException {
        Set<Singleton05> instances = execute(Singleton05.class);
        Assertions.assertEquals(1, instances.size(), "所有线程获取的 Singleton05 实例应该相同");
    }

    @Test
    @Order(6)
    @DisplayName("Singleton06：枚举类-线程安全")
    void testSingleton06() throws InterruptedException {
        Set<Singleton06> instances = execute(Singleton06.class);
        Assertions.assertEquals(1, instances.size(), "所有线程获取的 Singleton06 实例应该相同");
    }

    private static <T> Set<T> execute(Class<T> clazz) throws InterruptedException {
        List<Callable<T>> tasks = new ArrayList<>(NUM_THREADS);

        for (int i = 0; i < NUM_THREADS; i++) {
            tasks.add(() -> callStaticMethod(clazz, "getInstance"));
        }

        List<Future<T>> results = executorService.invokeAll(tasks);
        return results.stream().map(future -> {
            try {
                return future.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toSet());
    }

    @SuppressWarnings("unchecked")
    public static <T> T callStaticMethod(Class<T> clazz, String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return (T) method.invoke(null);
    }
}
