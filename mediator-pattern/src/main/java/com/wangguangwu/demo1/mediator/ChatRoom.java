package com.wangguangwu.demo1.mediator;

import com.wangguangwu.demo1.compent.User;

import java.util.Date;

/**
 * @author wangguangwu
 */
public final class ChatRoom {

    private ChatRoom() {
    }

    public static void showMessage(User user, String message) {
        System.out.println(new Date()
                + " [" + user.getName() + "] : " + message);
    }
}
