package com.wangguangwu.iterator.container.impl;

import com.wangguangwu.iterator.container.Container;
import com.wangguangwu.iterator.iterator.MyIterator;
import com.wangguangwu.iterator.product.Book;
import com.wangguangwu.iterator.product.Shelf;

import java.util.ArrayList;
import java.util.List;

/**
 * 图书馆类
 * <p>
 * 这是图书馆类，包含书架集合
 *
 * @author wangguangwu
 */
public class Library implements Container<Book> {

    private final List<Shelf> shelves = new ArrayList<>();

    /**
     * 添加书架
     *
     * @param shelf 书架对象
     */
    public void addShelf(Shelf shelf) {
        shelves.add(shelf);
    }

    /**
     * 删除书架
     *
     * @param shelf 书架对象
     * @return 是否删除成功
     */
    public boolean removeShelf(Shelf shelf) {
        return shelves.remove(shelf);
    }

    @Override
    public MyIterator<Book> getIterator() {
        return new LibraryIterator(shelves);
    }

    private static class LibraryIterator implements MyIterator<Book> {
        private final List<Shelf> shelves;
        private int shelfPosition = 0;
        private MyIterator<Book> currentShelfIterator;

        public LibraryIterator(List<Shelf> shelves) {
            this.shelves = shelves;
            if (!shelves.isEmpty()) {
                currentShelfIterator = shelves.get(0).getIterator();
            }
        }

        @Override
        public boolean hasNext() {
            if (currentShelfIterator == null) {
                return false;
            }
            if (currentShelfIterator.hasNext()) {
                return true;
            }
            // 当前书架没有更多书籍，移动到下一个书架
            shelfPosition++;
            if (shelfPosition < shelves.size()) {
                currentShelfIterator = shelves.get(shelfPosition).getIterator();
                return currentShelfIterator.hasNext();
            }
            return false;
        }

        @Override
        public Book next() {
            if (!hasNext()) {
                throw new IllegalStateException("没有更多元素");
            }
            return currentShelfIterator.next();
        }
    }
}
