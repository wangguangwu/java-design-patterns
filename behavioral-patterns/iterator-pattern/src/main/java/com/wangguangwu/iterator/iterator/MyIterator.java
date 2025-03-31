package com.wangguangwu.iterator.iterator;

/**
 * 自定义迭代器接口
 * <p>
 * 这是自定义迭代器接口，定义了迭代的基本方法
 *
 * @author wangguangwu
 */
public interface MyIterator<T> {

    /**
     * 是否有下一个元素
     *
     * @return 是否有下一个元素
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return 下一个元素
     */
    T next();
}
