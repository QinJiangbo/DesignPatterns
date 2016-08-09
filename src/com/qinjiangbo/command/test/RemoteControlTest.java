package com.qinjiangbo.command.test;

import com.qinjiangbo.command.command.*;
import com.qinjiangbo.command.pojo.Light;
import com.qinjiangbo.command.pojo.Stereo;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 5:33 PM
 * Author: Richard
 */
public class RemoteControlTest {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        //plugin the commands
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

        //start
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.onButtonPressed(2);

        //stop
        remoteControl.offButtonPressed(0);
        remoteControl.offButtonPressed(1);
        remoteControl.offButtonPressed(2);

        remoteControl.offButtonPressedUndo(2);
    }
}
