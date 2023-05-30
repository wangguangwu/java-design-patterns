package com.wangguangwu.demo1.element.impl;

import com.wangguangwu.demo1.element.ComputerPart;
import com.wangguangwu.demo1.visitor.ComputerPartVisitor;

/**
 * @author wangguangwu
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
