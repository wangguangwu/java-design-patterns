package com.wangguangwu.facade.subsystem;

/**
 * BIOS类
 * <p>
 * 这是计算机启动的第一个组件，负责初始化硬件和加载操作系统
 *
 * @author wangguangwu
 */
public class Bios {

    /**
     * 初始化BIOS
     */
    public void init() {
        System.out.println("BIOS: 初始化系统...");
    }

    /**
     * 加载操作系统
     */
    public void load() {
        System.out.println("BIOS: 加载操作系统...");
    }
}
