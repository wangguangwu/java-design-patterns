package com.wangguangwu.demo1.product.impl;

import com.wangguangwu.demo1.product.Order;
import com.wangguangwu.demo1.request.Stock;

/**
 * @author wangguangwu
 */
public class BuyStock implements Order {

    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
