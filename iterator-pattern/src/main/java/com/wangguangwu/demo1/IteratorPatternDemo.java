package com.wangguangwu.demo1;

import com.wangguangwu.demo1.container.impl.NameRepository;
import com.wangguangwu.demo1.iterator.Iterator;

/**
 * @author wangguangwu
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
