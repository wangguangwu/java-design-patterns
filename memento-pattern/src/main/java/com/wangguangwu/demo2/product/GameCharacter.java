package com.wangguangwu.demo2.product;

import com.wangguangwu.demo2.memento.CharacterMemento;

/**
 * @author wangguangwu
 */
public class GameCharacter {

    private int health;
    private int mana;
    private int gold;

    public GameCharacter(int health, int mana, int gold) {
        this.health = health;
        this.mana = mana;
        this.gold = gold;
    }

    public void fight() {
        health -= 10;
        mana -= 10;
        gold += 10;
    }

    public CharacterMemento save() {
        return new CharacterMemento(health, mana, gold);
    }

    public void restore(CharacterMemento memento) {
        health = memento.getHealth();
        mana = memento.getMana();
        gold = memento.getGold();
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "health=" + health +
                ", mana=" + mana +
                ", gold=" + gold +
                '}';
    }
}
