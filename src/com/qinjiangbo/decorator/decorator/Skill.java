package com.qinjiangbo.decorator.decorator;

import com.qinjiangbo.decorator.component.Hero;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/23/15 12:56 AM
 * Author: Richard
 */
public abstract class Skill extends Hero {

    public abstract int getDefend();
    public abstract int getAttack();
    public abstract int getResist();
    public abstract int getMagic();
    public abstract String getName();
    public abstract String getType();

    public abstract String showHero();
}
