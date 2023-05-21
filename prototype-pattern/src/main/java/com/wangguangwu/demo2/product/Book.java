package com.wangguangwu.demo2.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangguangwu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Cloneable {

    private String title;
    private Author author;

    @Override
    public Book clone() {
        try {
            // 需要对对象内部的引用对象也进行一次克隆，达到深克隆的效果
            Book cloned = (Book) super.clone();
            cloned.author = this.author.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
