package com.qinjiangbo.command.test;

import com.qinjiangbo.command.command.LightOnCommand;
import com.qinjiangbo.command.command.TVOnCommand;
import com.qinjiangbo.command.invoker.SimpleRemoteControl;
import com.qinjiangbo.command.receiver.Light;
import com.qinjiangbo.command.receiver.TV;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 4:48 PM
 * Author: Richard
 */
public class SimpleRemoteControlTest {

    public static void main(String[] args) {

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("Kitchen");
        LightOnCommand lightOn = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();

        System.out.println("============================");

        TV tv = new TV("Living room");
        TVOnCommand tvOn = new TVOnCommand(tv);

        simpleRemoteControl.setCommand(tvOn);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.back();
    }
}
