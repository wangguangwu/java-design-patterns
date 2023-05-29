package com.wangguangwu.demo1;

import com.wangguangwu.demo1.publisher.Subject;
import com.wangguangwu.demo1.subscriber.concreate.BinaryObserver;
import com.wangguangwu.demo1.subscriber.concreate.HexObserver;
import com.wangguangwu.demo1.subscriber.concreate.OctalObserver;

/**
 * @author wangguangwu
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("=======================");
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
