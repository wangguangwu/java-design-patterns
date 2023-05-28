package com.wangguangwu.demo2;

import com.wangguangwu.demo2.btroker.RemoteControl;
import com.wangguangwu.demo2.command.Command;
import com.wangguangwu.demo2.command.impl.AirConditionerOnCommand;
import com.wangguangwu.demo2.command.impl.LightOnCommand;
import com.wangguangwu.demo2.product.AirConditioner;
import com.wangguangwu.demo2.product.Light;

/**
 * @author wangguangwu
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();
        remoteControl.pressUndo();

        AirConditioner airConditioner = new AirConditioner();
        Command airConditionerOn = new AirConditionerOnCommand(airConditioner);
        remoteControl.setCommand(airConditionerOn);
        remoteControl.pressButton();
        remoteControl.pressUndo();
    }
}
