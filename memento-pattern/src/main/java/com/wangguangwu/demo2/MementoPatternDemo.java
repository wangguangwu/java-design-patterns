package com.wangguangwu.demo2;

import com.wangguangwu.demo2.caretaker.CharacterCareTaker;
import com.wangguangwu.demo2.product.GameCharacter;

/**
 * @author wangguangwu
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        GameCharacter character = new GameCharacter(100, 100, 0);
        CharacterCareTaker caretaker = new CharacterCareTaker();

        caretaker.save(character);
        System.out.println(character);

        character.fight();
        System.out.println(character);

        caretaker.save(character);
        character.fight();
        System.out.println(character);

        caretaker.undo(character);
        System.out.println(character);

        caretaker.undo(character);
        System.out.println(character);
    }
}
