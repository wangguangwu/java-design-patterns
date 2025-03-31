package com.wangguangwu.iterator.container;

import com.wangguangwu.iterator.iterator.MyIterator;

/**
 * 容器接口
 * <p>
 * 这是容器接口，定义了获取迭代器的方法
 *
 * @author wangguangwu
 */
public interface Container<T> {

    /**
     * 获取迭代器
     *
     * @return 迭代器对象
     */
    MyIterator<T> getIterator();
}