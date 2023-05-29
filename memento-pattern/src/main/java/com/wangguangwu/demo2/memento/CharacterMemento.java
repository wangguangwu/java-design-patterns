package com.wangguangwu.demo2.memento;

/**
 * @author wangguangwu
 */
public class CharacterMemento {

    private final int health;
    private final int mana;
    private final int gold;

    public CharacterMemento(int health, int mana, int gold) {
        this.health = health;
        this.mana = mana;
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getGold() {
        return gold;
    }
}
