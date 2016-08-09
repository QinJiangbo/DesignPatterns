package com.qinjiangbo.facade.facade;

import com.qinjiangbo.facade.subtask.CdPlayer;
import com.qinjiangbo.facade.subtask.Screen;
import com.qinjiangbo.facade.subtask.Tuner;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/15/15 11:04 AM
 * Author: Richard
 */
public class HomeFacade {

    CdPlayer cdPlayer;
    Screen screen;
    Tuner tuner;

    public HomeFacade(CdPlayer cdPlayer, Screen screen, Tuner tuner) {
        this.cdPlayer = cdPlayer;
        this.screen = screen;
        this.tuner = tuner;
    }

    public void watchMovie() {
        screen.up();
        cdPlayer.on();
        tuner.on();
    }

    public void endMovie() {
        tuner.off();
        cdPlayer.off();
        screen.down();
    }
}
