package com.qinjiangbo.command.command;

import com.qinjiangbo.command.pojo.Stereo;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 5:02 PM
 * Author: Richard
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
