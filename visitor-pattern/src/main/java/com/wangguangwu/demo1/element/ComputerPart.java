package com.wangguangwu.demo1.element;

import com.wangguangwu.demo1.visitor.ComputerPartVisitor;

/**
 * @author wangguangwu
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);

}
