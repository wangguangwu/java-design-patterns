package com.wangguangwu.iterator;

import com.wangguangwu.iterator.container.impl.Library;
import com.wangguangwu.iterator.iterator.MyIterator;
import com.wangguangwu.iterator.product.Book;
import com.wangguangwu.iterator.product.Shelf;

/**
 * 迭代器模式演示类
 * <p>
 * 迭代器模式（Iterator Pattern）是一种行为型设计模式，它提供了一种方法顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示。
 * <p>
 * 主要优点：
 * 1. 提供统一的遍历方式
 * 2. 访问聚合对象内部元素而不暴露内部结构
 * 3. 支持多种遍历方式
 * 4. 支持聚合对象的修改
 * <p>
 * 主要缺点：
 * 1. 增加了类的个数
 * 2. 需要为每个聚合对象实现一个迭代器
 * 3. 迭代器的实现可能比较复杂
 * <p>
 * 适用场景：
 * 1. 需要访问聚合对象的内容而不需要暴露其内部表示
 * 2. 需要支持多种遍历方式
 * 3. 需要为聚合对象提供多种遍历方式
 *
 * @author wangguangwu
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        // 创建图书馆
        Library library = new Library();

        // 创建第一个书架并添加书籍
        Shelf shelf1 = new Shelf();
        shelf1.addBook(new Book("Java编程思想", "Bruce Eckel", "123456"));
        shelf1.addBook(new Book("设计模式", "Erich Gamma", "789012"));
        library.addShelf(shelf1);

        // 创建第二个书架并添加书籍
        Shelf shelf2 = new Shelf();
        shelf2.addBook(new Book("重构", "Martin Fowler", "345678"));
        shelf2.addBook(new Book("代码整洁之道", "Robert C. Martin", "901234"));
        library.addShelf(shelf2);

        // 获取图书馆的迭代器
        MyIterator<Book> iterator = library.getIterator();

        // 遍历所有书籍
        System.out.println("图书馆中的所有书籍：");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }

        // 输出结果：
        // 图书馆中的所有书籍：
        // 书名：Java编程思想，作者：Bruce Eckel，ISBN：123456
        // 书名：设计模式，作者：Erich Gamma，ISBN：789012
        // 书名：重构，作者：Martin Fowler，ISBN：345678
        // 书名：代码整洁之道，作者：Robert C. Martin，ISBN：901234
    }
}
