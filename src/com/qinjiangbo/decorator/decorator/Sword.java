package com.qinjiangbo.decorator.decorator;

import com.qinjiangbo.decorator.component.Hero;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/23/15 1:12 AM
 * Author: Richard
 */
public class Sword extends Skill {

    Hero hero;

    public Sword(Hero hero) {
        this.hero = hero;
    }

    @Override
    public int getDefend() {
        return this.hero.getDefend() + 0;
    }

    @Override
    public int getAttack() {
        return this.hero.getAttack() + 45;
    }

    @Override
    public int getResist() {
        return this.hero.getResist() + 0;
    }

    @Override
    public int getMagic() {
        return this.hero.getMagic() + 10;
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
