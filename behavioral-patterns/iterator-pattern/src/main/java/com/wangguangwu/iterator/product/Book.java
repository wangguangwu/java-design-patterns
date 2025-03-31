package com.wangguangwu.iterator.product;

/**
 * 书籍类
 *
 * 这是书籍类，包含书籍信息
 *
 * @author wangguangwu
 */
public class Book {

    private final String title;
    private final String author;
    private final String isbn;

    /**
     * 构造函数
     *
     * @param title 书名
     * @param author 作者
     * @param isbn ISBN号
     */
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    /**
     * 获取书名
     *
     * @return 书名
     */
    public String getTitle() {
        return title;
    }

    /**
     * 获取作者
     *
     * @return 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 获取ISBN号
     *
     * @return ISBN号
     */
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format(
                "书名：%s，作者：%s，ISBN：%s",
                title, author, isbn
        );
    }
}
