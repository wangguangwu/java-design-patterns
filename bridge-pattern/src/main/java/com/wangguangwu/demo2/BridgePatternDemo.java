package com.wangguangwu.demo2;

import com.wangguangwu.demo2.product.Device;
import com.wangguangwu.demo2.product.impl.AdvancedRemote;
import com.wangguangwu.demo2.product.impl.BaseRemote;
import com.wangguangwu.demo2.product.impl.Radio;
import com.wangguangwu.demo2.product.impl.Tv;

/**
 * @author wangguangwu
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        testDevice(new Tv());
        System.out.println("=======================");
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BaseRemote baseRemote = new BaseRemote(device);
        baseRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
