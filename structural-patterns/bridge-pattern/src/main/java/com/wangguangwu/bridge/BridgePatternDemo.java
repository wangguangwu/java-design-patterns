package com.wangguangwu.bridge;

import com.wangguangwu.bridge.product.Device;
import com.wangguangwu.bridge.product.Remote;
import com.wangguangwu.bridge.product.impl.AdvancedRemote;
import com.wangguangwu.bridge.product.impl.BaseRemote;
import com.wangguangwu.bridge.product.impl.Radio;
import com.wangguangwu.bridge.product.impl.Tv;

/**
 * 桥接模式演示类
 * <p>
 * 桥接模式（Bridge Pattern）是一种结构型设计模式，它将抽象部分与实现部分分离，
 * 使它们可以独立变化。
 * <p>
 * 主要优点：
 * 1. 分离接口和实现
 * 2. 提供更好的扩展性
 * 3. 符合开闭原则
 * <p>
 * 主要缺点：
 * 1. 增加了系统的复杂度
 * 2. 可能导致代码难以维护
 * <p>
 * 适用场景：
 * 1. 当需要在多个维度上扩展类时
 * 2. 当不想使用继承来实现组合关系时
 * 3. 当需要动态切换实现时
 *
 * @author wangguangwu
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        // 测试电视机
        Device tv = new Tv();
        System.out.println("测试电视机:");
        testDevice(tv);
        System.out.println("=======================");

        // 测试收音机
        Device radio = new Radio();
        System.out.println("测试收音机:");
        testDevice(radio);
    }

    private static void testDevice(Device device) {
        System.out.println("使用基础遥控器:");
        Remote baseRemote = new BaseRemote(device);
        baseRemote.power();
        device.printStatus();
        baseRemote.volumeUp();
        baseRemote.channelUp();

        System.out.println("\n使用高级遥控器:");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
