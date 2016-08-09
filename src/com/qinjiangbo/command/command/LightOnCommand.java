package com.qinjiangbo.command.command;

import com.qinjiangbo.command.pojo.Light;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 4:39 PM
 * Author: Richard
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
