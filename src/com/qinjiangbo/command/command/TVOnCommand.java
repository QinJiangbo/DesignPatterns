package com.qinjiangbo.command.command;

import com.qinjiangbo.command.receiver.TV;

/**
 * @date: 23/02/2017 9:58 PM
 * @author: qinjiangbo@github.io
 */
public class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
