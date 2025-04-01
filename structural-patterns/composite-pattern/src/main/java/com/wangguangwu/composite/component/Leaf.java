package com.wangguangwu.composite.component;

/**
 * 叶子类
 * <p>
 * 这是叶子类，没有子组件
 *
 * @author wangguangwu
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("叶子节点不能添加子节点");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("叶子节点不能移除子节点");
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb + name);
    }
}
