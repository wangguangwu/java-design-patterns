package com.wangguangwu.proxy.proxy.impl;

import com.wangguangwu.proxy.proxy.NetworkRequest;

import java.util.concurrent.TimeUnit;

/**
 * 真实网络请求类
 * <p>
 * 这是被代理的具体实现类，负责实际的网络请求操作
 *
 * @author wangguangwu
 */
public class RealNetworkRequest implements NetworkRequest {

    private final String url;
    private final String method;

    /**
     * 构造函数
     *
     * @param url    请求URL
     * @param method 请求方法
     */
    public RealNetworkRequest(String url, String method) {
        this.url = url;
        this.method = method;
    }

    @Override
    public void execute() {
        System.out.printf(
                "执行 %s 请求到 %s%n",
                method, url
        );
        // 模拟网络请求延迟
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("请求完成");
    }
}
