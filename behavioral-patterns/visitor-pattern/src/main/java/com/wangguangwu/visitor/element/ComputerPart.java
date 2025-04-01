package com.wangguangwu.visitor.element;

import com.wangguangwu.visitor.visitor.ComputerPartVisitor;

/**
 * 计算机部件接口
 * <p>
 * 这是计算机部件接口，定义了接受访问者的方法
 *
 * @author wangguangwu
 */
public interface ComputerPart {

    /**
     * 接受访问者
     *
     * @param visitor 访问者对象
     */
    void accept(ComputerPartVisitor visitor);
}
