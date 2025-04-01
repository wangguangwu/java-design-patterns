package com.wangguangwu.memento.product;

import com.wangguangwu.memento.memento.impl.RoleMemento;

/**
 * 角色类
 * <p>
 * 这是角色类，包含角色的状态信息
 *
 * @author wangguangwu
 */
public class Role {

    // 生命值
    private int health;

    // 魔法值
    private int mana;

    // 等级
    private int level;

    /**
     * 构造函数
     *
     * @param health 生命值
     * @param mana   魔法值
     * @param level  等级
     */
    public Role(int health, int mana, int level) {
        this.health = health;
        this.mana = mana;
        this.level = level;
    }

    /**
     * 获取生命值
     *
     * @return 生命值
     */
    public int getHealth() {
        return health;
    }

    /**
     * 设置生命值
     *
     * @param health 生命值
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * 获取魔法值
     *
     * @return 魔法值
     */
    public int getMana() {
        return mana;
    }

    /**
     * 设置魔法值
     *
     * @param mana 魔法值
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * 获取等级
     *
     * @return 等级
     */
    public int getLevel() {
        return level;
    }

    /**
     * 设置等级
     *
     * @param level 等级
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * 保存状态
     *
     * @return 备忘录对象
     */
    public RoleMemento save() {
        return new RoleMemento(this);
    }

    /**
     * 战斗
     * <p>
     * 模拟战斗过程，减少生命值和魔法值
     */
    public void fight() {
        health = Math.max(0, health - 20);
        mana = Math.max(0, mana - 15);
        System.out.println("战斗中...");
    }

    /**
     * 休息
     * <p>
     * 模拟休息过程，恢复生命值和魔法值
     */
    public void rest() {
        health = Math.min(100, health + 20);
        mana = Math.min(100, mana + 15);
        System.out.println("休息中...");
    }

    @Override
    public String toString() {
        return String.format(
                "角色状态：\n生命值：%d\n魔法值：%d\n等级：%d",
                health, mana, level
        );
    }
}
