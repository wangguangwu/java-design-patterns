package com.wangguangwu.demo2.product.impl;

import com.wangguangwu.demo2.product.NetworkRequest;

/**
 * @author wangguangwu
 */
public class ProxyNetworkRequest implements NetworkRequest {

    private RealNetworkRequest realNetworkRequest;
    private final String url;
    private final String requestType;

    public ProxyNetworkRequest(String url, String requestType) {
        this.url = url;
        this.requestType = requestType;
    }

    @Override
    public void execute() {
        if (realNetworkRequest == null) {
            realNetworkRequest = new RealNetworkRequest(url, requestType);
        }
        realNetworkRequest.execute();
    }
}
