package com.wangguangwu.composite.composite;

import com.wangguangwu.composite.component.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合类
 * <p>
 * 这是组合类，可以包含其他组件
 *
 * @author wangguangwu
 */
public class Composite extends Component {

    private final List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb + name);

        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
