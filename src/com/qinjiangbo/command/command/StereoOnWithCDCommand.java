package com.qinjiangbo.command.command;

import com.qinjiangbo.command.pojo.Stereo;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 5:00 PM
 * Author: Richard
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
