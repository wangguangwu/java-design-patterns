package com.wangguangwu.demo2.product;

import lombok.Data;

/**
 * @author wangguangwu
 */
@Data
public class Computer {

    private Bios bios;
    private Hardware hardware;
    private OperatingSystem os;

    public Computer() {
        this.bios = new Bios();
        hardware = new Hardware();
        this.os = new OperatingSystem();
    }

    public void start() {
        bios.init();
        bios.load();
        hardware.check();;
        os.load();
    }
}
