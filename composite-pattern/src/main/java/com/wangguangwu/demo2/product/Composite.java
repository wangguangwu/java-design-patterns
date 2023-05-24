package com.wangguangwu.demo2.product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguangwu
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append('-');
        }
        System.out.println(sb + name);

        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
