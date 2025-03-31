package com.wangguangwu.composite.component;

/**
 * 组件接口
 * <p>
 * 这是抽象组件类，定义了所有组件的公共接口
 *
 * @author wangguangwu
 */
public abstract class Component {

    protected String name;

    protected Component(String name) {
        this.name = name;
    }

    /**
     * 添加子组件
     *
     * @param component 要添加的组件
     */
    public abstract void add(Component component);

    /**
     * 移除子组件
     *
     * @param component 要移除的组件
     */
    public abstract void remove(Component component);

    /**
     * 显示组件信息
     *
     * @param depth 层次深度
     */
    public abstract void display(int depth);
}
