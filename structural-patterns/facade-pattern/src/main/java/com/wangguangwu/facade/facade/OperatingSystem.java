package com.wangguangwu.facade.facade;

/**
 * 操作系统类
 * <p>
 * 这是计算机的操作系统，负责管理系统资源和提供用户界面
 *
 * @author wangguangwu
 */
@SuppressWarnings("all")
public class OperatingSystem {

    /**
     * 加载操作系统
     */
    public void load() {
        System.out.println("OperatingSystem: 加载系统...");
        loadKernel();
        loadGUI();
    }

    /**
     * 加载内核
     */
    private void loadKernel() {
        System.out.println("OperatingSystem: 加载内核...");
    }

    /**
     * 加载图形用户界面
     */
    private void loadGUI() {
        System.out.println("OperatingSystem: 加载图形用户界面...");
    }
}
