package com.qinjiangbo.decorator.component;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 11:34 PM
 * Author: Richard
 */
public abstract class Hero {

    public String name = "Unnamed Hero";

    public String type = "Unknown Type";

    public int defend = 45;
    public int attack = 58;
    public int resist = 55;
    public int magic = 40;

    public String showHero() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", defend=" + defend +
                ", attack=" + attack +
                ", resist=" + resist +
                ", magic=" + magic +
                '}';
    }

    public int getDefend() {
        return this.defend;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getResist() {
        return this.resist;
    }

    public int getMagic() {
        return this.magic;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
