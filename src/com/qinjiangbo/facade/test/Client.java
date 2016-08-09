package com.qinjiangbo.facade.test;

import com.qinjiangbo.facade.subtask.Screen;
import com.qinjiangbo.facade.facade.HomeFacade;
import com.qinjiangbo.facade.subtask.CdPlayer;
import com.qinjiangbo.facade.subtask.Tuner;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/15/15 11:06 AM
 * Author: Richard
 */
public class Client {

    public static void main(String[] args) {

        HomeFacade homeFacade = new HomeFacade(new CdPlayer(), new Screen(), new Tuner());
        homeFacade.watchMovie();
        homeFacade.endMovie();
    }
}
