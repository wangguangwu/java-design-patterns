package com.wangguangwu.demo1;

import com.wangguangwu.demo1.element.impl.Computer;
import com.wangguangwu.demo1.visitor.impl.ComputerPartDisplayVisitor;

/**
 * @author wangguangwu
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
