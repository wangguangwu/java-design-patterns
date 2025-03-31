package com.wangguangwu.btroker;

import com.wangguangwu.command.Command;

/**
 * 遥控器类
 * <p>
 * 这是命令的调用者，负责执行命令
 *
 * @author wangguangwu
 */
public class RemoteControl {

    private Command command;

    /**
     * 设置命令
     *
     * @param command 命令对象
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 按下按钮
     */
    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }

    /**
     * 按下撤销按钮
     */
    public void pressUndo() {
        if (command != null) {
            command.undo();
        }
    }
}
