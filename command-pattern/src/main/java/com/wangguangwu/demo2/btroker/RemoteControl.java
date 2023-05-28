package com.wangguangwu.demo2.btroker;

import com.wangguangwu.demo2.command.Command;

/**
 * @author wangguangwu
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}
