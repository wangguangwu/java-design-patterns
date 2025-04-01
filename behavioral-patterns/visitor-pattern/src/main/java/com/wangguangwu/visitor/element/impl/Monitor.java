package com.wangguangwu.visitor.element.impl;

import com.wangguangwu.visitor.element.ComputerPart;
import com.wangguangwu.visitor.visitor.ComputerPartVisitor;

/**
 * 显示器类
 * <p>
 * 这是显示器类，实现计算机部件接口
 *
 * @author wangguangwu
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 显示内容
     */
    public void display() {
        System.out.println("显示器显示内容");
    }

    /**
     * 调整亮度
     */
    public void adjustBrightness() {
        System.out.println("调整显示器亮度");
    }
}
