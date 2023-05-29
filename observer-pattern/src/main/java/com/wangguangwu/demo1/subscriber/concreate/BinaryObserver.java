package com.wangguangwu.demo1.subscriber.concreate;

import com.wangguangwu.demo1.publisher.Subject;
import com.wangguangwu.demo1.subscriber.Observer;

/**
 * @author wangguangwu
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
