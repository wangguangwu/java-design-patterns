package com.wangguangwu.visitor.visitor;

import com.wangguangwu.visitor.element.impl.Computer;
import com.wangguangwu.visitor.element.impl.Keyboard;
import com.wangguangwu.visitor.element.impl.Monitor;
import com.wangguangwu.visitor.element.impl.Mouse;

/**
 * 计算机部件访问者接口
 * <p>
 * 这是计算机部件访问者接口，定义了访问不同计算机部件的方法
 *
 * @author wangguangwu
 */
public interface ComputerPartVisitor {

    /**
     * 访问计算机
     *
     * @param computer 计算机对象
     */
    void visit(Computer computer);

    /**
     * 访问键盘
     *
     * @param keyboard 键盘对象
     */
    void visit(Keyboard keyboard);

    /**
     * 访问鼠标
     *
     * @param mouse 鼠标对象
     */
    void visit(Mouse mouse);

    /**
     * 访问显示器
     *
     * @param monitor 显示器对象
     */
    void visit(Monitor monitor);
}
