package com.qinjiangbo.command.command;

import com.qinjiangbo.command.pojo.Light;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 4:41 PM
 * Author: Richard
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
