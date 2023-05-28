package com.wangguangwu.demo2;

import com.wangguangwu.demo1.iterator.Iterator;
import com.wangguangwu.demo2.container.impl.Library;
import com.wangguangwu.demo2.product.Book;
import com.wangguangwu.demo2.product.Shelf;

/**
 * @author wangguangwu
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        Library library = new Library();
        Shelf shelf1 = new Shelf();
        shelf1.addBook(new Book("Book 1"));
        shelf1.addBook(new Book("Book 2"));
        library.addShelf(shelf1);
        Shelf shelf2 = new Shelf();
        shelf2.addBook(new Book("Book 3"));
        shelf2.addBook(new Book("Book 4"));
        library.addShelf(shelf2);

        Iterator iterator = library.getIterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getTitle());
        }
    }
}
