package com.wangguangwu.demo2.product;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguangwu
 */
@Data
@AllArgsConstructor
public class Library implements Cloneable {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public Library clone() {
        try {
            Library clone = (Library) super.clone();
            clone.books = new ArrayList<>();
            // 深克隆
            for (Book book : this.books) {
                clone.books.add(book.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
