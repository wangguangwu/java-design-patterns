package com.wangguangwu.demo1.subscriber;

import com.wangguangwu.demo1.publisher.Subject;

/**
 * @author wangguangwu
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
