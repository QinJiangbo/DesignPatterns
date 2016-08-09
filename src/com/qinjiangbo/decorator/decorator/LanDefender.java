package com.qinjiangbo.decorator.decorator;

import com.qinjiangbo.decorator.component.Hero;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/23/15 1:15 AM
 * Author: Richard
 */
public class LanDefender extends Skill {

    Hero hero;

    public LanDefender(Hero hero) {
        this.hero = hero;
    }

    @Override
    public int getDefend() {
        return this.hero.getDefend() + 50;
    }

    @Override
    public int getAttack() {
        return this.hero.getAttack() + 10;
    }

    @Override
    public int getResist() {
        return this.hero.getResist() + 55;
    }

    @Override
    public int getMagic() {
        return this.hero.getMagic() + 12;
    }

    @Override
    public String getName() {
        return this.hero.getName();
    }

    @Override
    public String getType() {
        return this.hero.getType();
    }

    @Override
    public String showHero() {
        return "Hero{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", defend=" + getDefend() +
                ", attack=" + getAttack() +
                ", resist=" + getResist() +
                ", magic=" + getMagic() +
                '}';
    }
}
