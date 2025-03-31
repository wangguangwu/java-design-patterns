package com.wangguangwu.proxy.product.impl;

import com.wangguangwu.proxy.product.NetworkRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * 网络请求代理类
 * <p>
 * 这是代理类，负责缓存网络请求结果
 *
 * @author wangguangwu
 */
public class ProxyNetworkRequest implements NetworkRequest {

    private final String url;
    private final String method;
    private final RealNetworkRequest realRequest;
    private static final Map<String, String> CACHE = new HashMap<>();

    /**
     * 构造函数
     *
     * @param url    请求URL
     * @param method 请求方法
     */
    public ProxyNetworkRequest(String url, String method) {
        this.url = url;
        this.method = method;
        this.realRequest = new RealNetworkRequest(url, method);
    }

    @Override
    public void execute() {
        String cacheKey = url + "-" + method;
        if (CACHE.containsKey(cacheKey)) {
            System.out.println("从缓存中获取结果");
            System.out.println("缓存结果：" + CACHE.get(cacheKey));
        } else {
            System.out.println("执行网络请求");
            realRequest.execute();
            // 模拟请求结果
            String result = "请求成功，返回数据...";
            CACHE.put(cacheKey, result);
            System.out.println("缓存结果：" + result);
        }
    }
}
