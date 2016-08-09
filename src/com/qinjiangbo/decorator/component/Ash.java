package com.qinjiangbo.decorator.component;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/23/15 1:08 AM
 * Author: Richard
 */
public class Ash extends Hero {

    public Ash() {
        name = "Ash";
        type = "ADC";
        attack = attack + 50;
        defend = defend + 5;
        resist = resist + 12;
        magic = magic + 20;
    }
}
