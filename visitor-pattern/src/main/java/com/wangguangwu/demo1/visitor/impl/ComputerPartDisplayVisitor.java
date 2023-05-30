package com.wangguangwu.demo1.visitor.impl;

import com.wangguangwu.demo1.element.impl.Computer;
import com.wangguangwu.demo1.element.impl.Keyboard;
import com.wangguangwu.demo1.element.impl.Monitor;
import com.wangguangwu.demo1.element.impl.Mouse;
import com.wangguangwu.demo1.visitor.ComputerPartVisitor;

/**
 * @author wangguangwu
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }
}
