package com.wangguangwu.demo2;

import com.wangguangwu.demo2.product.Computer;

/**
 * @author wangguangwu
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
    }
}
