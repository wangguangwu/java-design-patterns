package com.wangguangwu;

import com.wangguangwu.btroker.RemoteControl;
import com.wangguangwu.command.Command;
import com.wangguangwu.command.impl.AirConditionerOnCommand;
import com.wangguangwu.command.impl.LightOnCommand;
import com.wangguangwu.product.AirConditioner;
import com.wangguangwu.product.Light;

/**
 * 命令模式演示类
 * <p>
 * 命令模式（Command Pattern）是一种行为型设计模式，它将请求封装为对象，从而使你能够用不同的请求、队列或者请求日志参数化其他对象。
 * <p>
 * 主要优点：
 * 1. 将请求的发送者和接收者解耦
 * 2. 支持撤销操作
 * 3. 支持命令队列
 * 4. 支持日志记录
 * <p>
 * 主要缺点：
 * 1. 可能导致系统中类的数量增加
 * 2. 需要为每个命令创建一个类
 * 3. 命令类可能会变得复杂
 * <p>
 * 适用场景：
 * 1. 需要将请求排队或记录请求日志
 * 2. 需要支持撤销操作
 * 3. 需要将系统组件解耦
 *
 * @author wangguangwu
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        // 创建遥控器
        RemoteControl remoteControl = new RemoteControl();

        // 创建灯光
        Light light = new Light();
        // 创建灯光开启命令
        Command lightOnCommand = new LightOnCommand(light);
        // 设置命令
        remoteControl.setCommand(lightOnCommand);
        // 按下按钮
        remoteControl.pressButton();
        // 按下撤销按钮
        remoteControl.pressUndo();

        // 创建空调
        AirConditioner airConditioner = new AirConditioner();
        // 创建空调开启命令
        Command airConditionerOnCommand = new AirConditionerOnCommand(airConditioner);
        // 设置命令
        remoteControl.setCommand(airConditionerOnCommand);
        // 按下按钮
        remoteControl.pressButton();
        // 按下撤销按钮
        remoteControl.pressUndo();

        // 输出结果：
        // 灯光已开启
        // 撤销操作：灯光已关闭
        // 空调已开启，设置温度为25度
        // 撤销操作：空调已关闭
    }
}
