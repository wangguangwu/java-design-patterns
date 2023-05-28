package com.wangguangwu.demo1.product.impl;

import com.wangguangwu.demo1.product.Order;
import com.wangguangwu.demo1.request.Stock;

/**
 * @author wangguangwu
 */
public class SellStock implements Order {

    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
