package com.wangguangwu.demo2.product;

import lombok.AllArgsConstructor;

/**
 * @author wangguangwu
 */
@AllArgsConstructor
public abstract class Component {

    protected String name;

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);

}
