package com.wangguangwu.visitor.element.impl;

import com.wangguangwu.visitor.element.ComputerPart;
import com.wangguangwu.visitor.visitor.ComputerPartVisitor;

/**
 * 鼠标类
 * <p>
 * 这是鼠标类，实现计算机部件接口
 *
 * @author wangguangwu
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 鼠标点击
     */
    public void click() {
        System.out.println("鼠标点击");
    }

    /**
     * 鼠标移动
     */
    public void move() {
        System.out.println("鼠标移动");
    }
}
