package com.wangguangwu.demo1.memento;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wangguangwu
 */
public class CareTaker {

    private final List<Memento> mementoList = new LinkedList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
