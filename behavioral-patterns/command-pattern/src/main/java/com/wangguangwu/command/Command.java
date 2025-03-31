package com.wangguangwu.command;

/**
 * 命令接口
 * <p>
 * 这是命令接口，定义了执行和撤销命令的方法
 *
 * @author wangguangwu
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
