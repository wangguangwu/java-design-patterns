package com.wangguangwu.proxy;

import com.wangguangwu.proxy.product.NetworkRequest;
import com.wangguangwu.proxy.product.impl.ProxyNetworkRequest;

/**
 * 代理模式演示类
 * <p>
 * 代理模式（Proxy Pattern）是一种结构型设计模式，它允许你提供一个代理对象来控制对另一个对象的访问。
 * <p>
 * 主要优点：
 * 1. 可以控制对目标对象的访问
 * 2. 可以在访问目标对象时添加额外的操作
 * 3. 可以延迟目标对象的创建
 * <p>
 * 主要缺点：
 * 1. 代码复杂度增加
 * 2. 可能导致性能降低
 * 3. 需要维护代理对象
 * <p>
 * 适用场景：
 * 1. 当需要控制对对象的访问时
 * 2. 当需要延迟对象的创建时
 * 3. 当需要在访问对象时添加额外的操作时
 *
 * @author wangguangwu
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        // 创建网络请求
        NetworkRequest request1 = new ProxyNetworkRequest("http://example.com", "GET");
        NetworkRequest request2 = new ProxyNetworkRequest("http://example.com", "POST");
        NetworkRequest request3 = new ProxyNetworkRequest("http://example.com", "GET");

        System.out.println("第一次执行请求：");
        request1.execute();
        request2.execute();
        request3.execute();

        System.out.println("\n第二次执行请求：");
        request1.execute();
        request2.execute();
        request3.execute();
    }
}
