package com.wangguangwu.demo2;

import com.wangguangwu.demo2.product.Author;
import com.wangguangwu.demo2.product.Book;
import com.wangguangwu.demo2.product.Library;

/**
 * @author wangguangwu
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");
        Book book = new Book("Harry Potter", author);
        Library library = new Library();
        library.addBook(book);

        Library clonedLibrary = library.clone();

        // change the value
        clonedLibrary.getBooks().get(0).getAuthor().setName("George R. R. Martin");
        clonedLibrary.getBooks().get(0).setTitle("A Song of Ice and Fire");

        // compare with original with cloned
        System.out.println(library.getBooks().get(0).getTitle());
        System.out.println(library.getBooks().get(0).getAuthor().getName());
        System.out.println("=================================");
        System.out.println(clonedLibrary.getBooks().get(0).getTitle());
        System.out.println(clonedLibrary.getBooks().get(0).getAuthor().getName());
    }
}
