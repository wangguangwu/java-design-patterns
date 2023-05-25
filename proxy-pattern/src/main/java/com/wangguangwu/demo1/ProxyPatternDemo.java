package com.wangguangwu.demo1;

import com.wangguangwu.demo1.product.Image;
import com.wangguangwu.demo1.product.impl.ProxyImage;

/**
 * @author wangguangwu
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("hello.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("===========");
        // 图像不需要从磁盘加载
        image.display();
    }
}
