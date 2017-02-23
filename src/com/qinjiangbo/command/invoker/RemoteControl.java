package com.qinjiangbo.command.invoker;

import com.qinjiangbo.command.command.Command;
import com.qinjiangbo.command.command.NoCommand;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 5:06 PM
 * Author: Richard
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[4];
        offCommands = new Command[4];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 4; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }

    public void onButtonPressedUndo(int slot) {
        onCommands[slot].undo();
    }

    public void offButtonPressedUndo(int slot) {
        offCommands[slot].undo();
    }
}
