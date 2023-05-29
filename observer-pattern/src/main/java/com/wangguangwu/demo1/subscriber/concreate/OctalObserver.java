package com.wangguangwu.demo1.subscriber.concreate;

import com.wangguangwu.demo1.publisher.Subject;
import com.wangguangwu.demo1.subscriber.Observer;

/**
 * @author wangguangwu
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
