package com.wangguangwu.visitor.element.impl;

import com.wangguangwu.visitor.element.ComputerPart;
import com.wangguangwu.visitor.visitor.ComputerPartVisitor;

/**
 * 键盘类
 * <p>
 * 这是键盘类，实现计算机部件接口
 *
 * @author wangguangwu
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 键盘输入
     */
    public void input() {
        System.out.println("键盘输入");
    }

    /**
     * 键盘快捷键
     */
    public void shortcut() {
        System.out.println("键盘快捷键");
    }
}

