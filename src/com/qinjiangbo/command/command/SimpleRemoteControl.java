package com.qinjiangbo.command.command;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 4:45 PM
 * Author: Richard
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
