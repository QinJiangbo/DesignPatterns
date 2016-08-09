package com.qinjiangbo.decorator.component;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/23/15 1:07 AM
 * Author: Richard
 */
public class Garen extends Hero {

    public Garen() {
        name = "Garen";
        type = "Tank";
        attack = attack + 10;
        defend = defend + 45;
        resist = resist + 32;
        magic = magic + 10;
    }
}
