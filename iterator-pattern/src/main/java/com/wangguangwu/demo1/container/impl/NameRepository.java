package com.wangguangwu.demo1.container.impl;

import com.wangguangwu.demo1.container.Container;
import com.wangguangwu.demo1.iterator.Iterator;

/**
 * @author wangguangwu
 */
public class NameRepository implements Container {

    public final String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? names[index++] : null;
        }
    }
}
