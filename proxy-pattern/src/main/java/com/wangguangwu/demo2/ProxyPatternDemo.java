package com.wangguangwu.demo2;

import com.wangguangwu.demo2.product.NetworkRequest;
import com.wangguangwu.demo2.product.impl.ProxyNetworkRequest;

/**
 * @author wangguangwu
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        NetworkRequest request1 = new ProxyNetworkRequest("http://example.com", "GET");
        NetworkRequest request2 = new ProxyNetworkRequest("http://example.com", "POST");
        NetworkRequest request3 = new ProxyNetworkRequest("http://example.com", "GET");

        request1.execute();
        request2.execute();
        request3.execute();

        System.out.println("====================================================");

        request1.execute();
        request2.execute();
        request3.execute();
    }
}
