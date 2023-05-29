package com.wangguangwu.demo2.caretaker;

import com.wangguangwu.demo2.memento.CharacterMemento;
import com.wangguangwu.demo2.product.GameCharacter;

import java.util.Stack;

/**
 * @author wangguangwu
 */
public class CharacterCareTaker {

    private final Stack<CharacterMemento> mementoStack = new Stack<>();

    public void save(GameCharacter character) {
        mementoStack.push(character.save());
    }

    public void undo(GameCharacter character) {
        if (!mementoStack.isEmpty()) {
            CharacterMemento memento = mementoStack.pop();
            character.restore(memento);
        }
    }
}
