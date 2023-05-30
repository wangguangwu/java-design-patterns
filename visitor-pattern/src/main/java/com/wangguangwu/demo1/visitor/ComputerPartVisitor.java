package com.wangguangwu.demo1.visitor;

import com.wangguangwu.demo1.element.impl.Computer;
import com.wangguangwu.demo1.element.impl.Keyboard;
import com.wangguangwu.demo1.element.impl.Monitor;
import com.wangguangwu.demo1.element.impl.Mouse;

/**
 * @author wangguangwu
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

}
