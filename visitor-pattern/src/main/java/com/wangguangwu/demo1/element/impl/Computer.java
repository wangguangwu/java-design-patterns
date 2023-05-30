package com.wangguangwu.demo1.element.impl;

import com.wangguangwu.demo1.element.ComputerPart;
import com.wangguangwu.demo1.visitor.ComputerPartVisitor;

/**
 * @author wangguangwu
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
