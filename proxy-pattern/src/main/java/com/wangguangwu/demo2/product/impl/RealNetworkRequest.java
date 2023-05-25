package com.wangguangwu.demo2.product.impl;

import com.wangguangwu.demo2.product.NetworkRequest;

/**
 * @author wangguangwu
 */
public class RealNetworkRequest implements NetworkRequest {

    private final String url;
    private final String requestType;

    public RealNetworkRequest(String url, String requestType) {
        this.url = url;
        this.requestType = requestType;
        loadFromNetwork(url, requestType);
    }

    @Override
    public void execute() {
        System.out.println("Executing " + requestType + " request for " + url);
    }

    private void loadFromNetwork(String url, String requestType) {
        System.out.println("Loading " + requestType + " request for " + url);
    }
}
