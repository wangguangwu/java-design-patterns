package com.wangguangwu.memento.memento;

import com.wangguangwu.memento.product.Role;

/**
 * 角色备忘录类
 * <p>
 * 这是角色备忘录类，用于保存角色的状态
 *
 * @author wangguangwu
 */
public class RoleMemento implements Memento {

    private final int health;
    private final int mana;
    private final int level;

    /**
     * 构造函数
     *
     * @param role 角色对象
     */
    public RoleMemento(Role role) {
        this.health = role.getHealth();
        this.mana = role.getMana();
        this.level = role.getLevel();
    }

    /**
     * 获取状态
     *
     * @return 对象状态
     */
    @Override
    public Role getRole() {
        return new Role(health, mana, level);
    }

    /**
     * 恢复状态
     *
     * @param role 角色对象
     */
    @Override
    public void restore(Role role) {
        role.setHealth(health);
        role.setMana(mana);
        role.setLevel(level);
    }
}