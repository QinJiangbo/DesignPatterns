package com.qinjiangbo.decorator.component;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/23/15 1:02 AM
 * Author: Richard
 */
public class MasterYi extends Hero {

    public MasterYi() {
        name = "Master Yi";
        type = "Killer";
        attack = attack + 20;
        defend = defend + 15;
        resist = resist + 12;
        magic = magic + 5;
    }

}
