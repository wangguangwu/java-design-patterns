package com.wangguangwu.facade.subsystem;

/**
 * 硬件类
 * <p>
 * 这是计算机的硬件组件集合，负责检查和初始化硬件
 *
 * @author wangguangwu
 */
@SuppressWarnings("all")
public class Hardware {

    /**
     * 检查硬件状态
     */
    public void check() {
        System.out.println("Hardware: 检查硬件状态...");
        checkCPU();
        checkRAM();
        checkHardDrive();
    }

    /**
     * 检查CPU状态
     */
    private void checkCPU() {
        System.out.println("Hardware: 检查CPU状态...");
    }

    /**
     * 检查RAM状态
     */
    private void checkRAM() {
        System.out.println("Hardware: 检查RAM状态...");
    }

    /**
     * 检查硬盘状态
     */
    private void checkHardDrive() {
        System.out.println("Hardware: 检查硬盘状态...");
    }
}
