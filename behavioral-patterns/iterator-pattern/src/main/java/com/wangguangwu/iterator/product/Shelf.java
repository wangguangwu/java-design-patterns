package com.wangguangwu.iterator.product;

import com.wangguangwu.iterator.container.Container;
import com.wangguangwu.iterator.iterator.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 书架类
 * <p>
 * 这是书架类，包含书籍集合
 *
 * @author wangguangwu
 */
public class Shelf implements Container<Book> {

    private final List<Book> books = new ArrayList<>();

    /**
     * 添加书籍
     *
     * @param book 书籍对象
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * 删除书籍
     *
     * @param book 书籍对象
     * @return 是否删除成功
     */
    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    @Override
    public MyIterator<Book> getIterator() {
        return new BookIterator(books);
    }

    private static class BookIterator implements MyIterator<Book> {
        private final List<Book> books;
        private int position = 0;

        public BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            if (!hasNext()) {
                throw new IllegalStateException("没有更多元素");
            }
            return books.get(position++);
        }
    }
}