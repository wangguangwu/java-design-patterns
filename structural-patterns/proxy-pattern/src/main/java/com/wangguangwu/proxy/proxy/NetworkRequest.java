package com.wangguangwu.proxy.proxy;

/**
 * 网络请求接口
 * <p>
 * 这是被代理的接口，定义了网络请求的基本操作
 *
 * @author wangguangwu
 */
public interface NetworkRequest {

    /**
     * 执行网络请求
     */
    void execute();
}
