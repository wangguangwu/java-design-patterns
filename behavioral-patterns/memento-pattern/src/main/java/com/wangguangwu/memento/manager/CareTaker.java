package com.wangguangwu.memento.manager;

import com.wangguangwu.memento.memento.RoleMemento;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者类
 * <p>
 * 这是管理者类，负责保存和恢复对象的状态
 *
 * @author wangguangwu
 */
public class CareTaker {

    private final List<RoleMemento> mementos = new ArrayList<>();
    private int current = -1;

    /**
     * 保存状态
     *
     * @param memento 备忘录对象
     */
    public void save(RoleMemento memento) {
        if (current < mementos.size() - 1) {
            mementos.subList(current + 1, mementos.size()).clear();
        }
        mementos.add(memento);
        current++;
    }

    /**
     * 撤销操作
     *
     * @return 上一个备忘录对象
     */
    public RoleMemento undo() {
        if (current > 0) {
            current--;
            return mementos.get(current);
        }
        return null;
    }

    /**
     * 重做操作
     *
     * @return 下一个备忘录对象
     */
    public RoleMemento redo() {
        if (current < mementos.size() - 1) {
            current++;
            return mementos.get(current);
        }
        return null;
    }

    /**
     * 获取当前状态
     *
     * @return 当前备忘录对象
     */
    public RoleMemento getCurrent() {
        if (current >= 0) {
            return mementos.get(current);
        }
        return null;
    }
}
