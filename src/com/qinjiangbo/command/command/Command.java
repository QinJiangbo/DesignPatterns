package com.qinjiangbo.command.command;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 4:37 PM
 * Author: Richard
 */
public interface Command {

    public void execute();

    public void undo();
}
