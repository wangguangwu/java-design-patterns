package com.wangguangwu.demo1;

import com.wangguangwu.demo1.compent.User;

/**
 * @author wangguangwu
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
