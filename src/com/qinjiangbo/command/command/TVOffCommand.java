package com.qinjiangbo.command.command;

import com.qinjiangbo.command.receiver.TV;

/**
 * @date: 23/02/2017 9:58 PM
 * @author: qinjiangbo@github.io
 */
public class TVOffCommand implements Command {

    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
