package com.wangguangwu.demo2.container.impl;

import com.wangguangwu.demo1.iterator.Iterator;
import com.wangguangwu.demo2.container.Container;
import com.wangguangwu.demo2.product.Book;
import com.wangguangwu.demo2.product.Shelf;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguangwu
 */
public class Library implements Container {

    private final List<Shelf> shelves = new ArrayList<>();

    public void addShelf(Shelf shelf) {
        shelves.add(shelf);
    }

    public List<Shelf> getShelves() {
        return shelves;
    }

    @Override
    public Iterator getIterator() {
        return new LibraryIterator(this);
    }

    private static class LibraryIterator implements Iterator {

        private final Library library;
        private int shelfIndex;
        private int bookIndex;

        public LibraryIterator(Library library) {
            this.library = library;
        }

        @Override
        public boolean hasNext() {
            return shelfIndex < library.getShelves().size() &&
                    bookIndex < library.getShelves().get(shelfIndex).getBooks().size();
        }

        @Override
        public Object next() {
            Book book = library.getShelves().get(shelfIndex).getBooks().get(bookIndex);
            bookIndex++;
            if (bookIndex >= library.getShelves().get(shelfIndex).getBooks().size()) {
                bookIndex = 0;
                shelfIndex++;
            }
            return book;
        }
    }
}
