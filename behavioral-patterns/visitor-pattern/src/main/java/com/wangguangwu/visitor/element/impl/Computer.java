package com.wangguangwu.visitor.element.impl;

import com.wangguangwu.visitor.element.ComputerPart;
import com.wangguangwu.visitor.visitor.ComputerPartVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算机类
 * <p>
 * 这是计算机类，实现计算机部件接口，管理计算机部件的集合
 *
 * @author wangguangwu
 */
public class Computer implements ComputerPart {

    private final List<ComputerPart> parts;

    /**
     * 构造函数
     */
    public Computer() {
        parts = new ArrayList<>();
    }

    /**
     * 添加部件
     *
     * @param part 部件对象
     */
    public void addPart(ComputerPart part) {
        parts.add(part);
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }

    /**
     * 启动计算机
     */
    public void start() {
        System.out.println("计算机启动");
    }

    /**
     * 关闭计算机
     */
    public void shutdown() {
        System.out.println("计算机关闭");
    }
}
