package com.wangguangwu.facade.product;

/**
 * 计算机类
 * <p>
 * 这是外观类，提供了一个统一的接口来访问复杂的计算机启动过程
 *
 * @author wangguangwu
 */
public class Computer {

    private final Bios bios;
    private final Hardware hardware;
    private final OperatingSystem os;

    public Computer() {
        this.bios = new Bios();
        this.hardware = new Hardware();
        this.os = new OperatingSystem();
    }

    /**
     * 启动计算机
     * <p>
     * 这个方法封装了计算机启动的整个过程，包括：
     * 1. BIOS初始化
     * 2. BIOS加载
     * 3. 硬件检查
     * 4. 操作系统加载
     */
    public void start() {
        bios.init();
        bios.load();
        hardware.check();
        os.load();
    }
}
