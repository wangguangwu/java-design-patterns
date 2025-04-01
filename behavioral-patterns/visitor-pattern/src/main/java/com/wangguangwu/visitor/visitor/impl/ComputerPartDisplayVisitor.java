package com.wangguangwu.visitor.visitor.impl;

import com.wangguangwu.visitor.element.impl.Computer;
import com.wangguangwu.visitor.element.impl.Keyboard;
import com.wangguangwu.visitor.element.impl.Monitor;
import com.wangguangwu.visitor.element.impl.Mouse;
import com.wangguangwu.visitor.visitor.ComputerPartVisitor;

/**
 * 计算机部件显示访问者类
 * <p>
 * 这是计算机部件显示访问者类，实现访问者接口
 *
 * @author wangguangwu
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        computer.start();
        System.out.println("访问计算机");
        computer.shutdown();
    }

    @Override
    public void visit(Keyboard keyboard) {
        keyboard.input();
        keyboard.shortcut();
        System.out.println("访问键盘");
    }

    @Override
    public void visit(Mouse mouse) {
        mouse.click();
        mouse.move();
        System.out.println("访问鼠标");
    }

    @Override
    public void visit(Monitor monitor) {
        monitor.display();
        monitor.adjustBrightness();
        System.out.println("访问显示器");
    }
}
