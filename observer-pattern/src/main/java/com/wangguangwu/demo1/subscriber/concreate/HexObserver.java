package com.wangguangwu.demo1.subscriber.concreate;

import com.wangguangwu.demo1.publisher.Subject;
import com.wangguangwu.demo1.subscriber.Observer;

/**
 * @author wangguangwu
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
