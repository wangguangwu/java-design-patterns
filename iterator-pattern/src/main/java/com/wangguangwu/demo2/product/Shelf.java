package com.wangguangwu.demo2.product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguangwu
 */
public class Shelf {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
