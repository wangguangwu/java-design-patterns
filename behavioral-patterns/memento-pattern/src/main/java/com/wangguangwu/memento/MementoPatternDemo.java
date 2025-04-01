package com.wangguangwu.memento;

import com.wangguangwu.memento.memento.impl.RoleMemento;
import com.wangguangwu.memento.manager.CareTaker;
import com.wangguangwu.memento.product.Role;

/**
 * 备忘录模式演示类
 * <p>
 * 备忘录模式（Memento Pattern）是一种行为型设计模式，它允许在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 这样以后就可将该对象恢复到原先保存的状态。
 * <p>
 * 主要优点：
 * 1. 提供了一种恢复机制
 * 2. 保持封装性
 * 3. 支持撤销操作
 * 4. 支持重做操作
 * <p>
 * 主要缺点：
 * 1. 消耗内存
 * 2. 需要保存大量状态
 * 3. 状态管理复杂
 * <p>
 * 适用场景：
 * 1. 需要保存对象状态
 * 2. 需要支持撤销操作
 * 3. 需要支持重做操作
 * 4. 需要保持对象封装性
 *
 * @author wangguangwu
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        // 创建角色
        Role role = new Role(100, 100, 1);
        System.out.println("初始状态：");
        System.out.println(role);

        // 创建管理者
        CareTaker caretaker = new CareTaker();

        // 保存状态
        System.out.println("\n保存状态：");
        caretaker.save(role.save());
        System.out.println(role);

        // 战斗
        System.out.println("\n战斗：");
        role.fight();
        System.out.println(role);

        // 保存状态
        System.out.println("\n保存状态：");
        caretaker.save(role.save());
        System.out.println(caretaker.getCurrent().getRole());

        // 战斗
        System.out.println("\n战斗：");
        role.fight();
        System.out.println(role);

        // 撤销操作
        System.out.println("\n撤销操作：");
        RoleMemento memento = caretaker.undo();
        if (memento != null) {
            memento.restore(role);
        }
        System.out.println(role);

        // 重做操作
        System.out.println("\n重做操作：");
        memento = caretaker.redo();
        if (memento != null) {
            memento.restore(role);
        }
        System.out.println(role);

        // 撤销操作
        System.out.println("\n撤销操作：");
        memento = caretaker.undo();
        if (memento != null) {
            memento.restore(role);
        }
        System.out.println(role);

        // 撤销操作
        System.out.println("\n撤销操作：");
        memento = caretaker.undo();
        if (memento != null) {
            memento.restore(role);
        }
        System.out.println(role);
    }
}
