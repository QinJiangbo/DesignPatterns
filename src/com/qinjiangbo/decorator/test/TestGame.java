package com.qinjiangbo.decorator.test;

import com.qinjiangbo.decorator.component.Hero;
import com.qinjiangbo.decorator.component.MasterYi;
import com.qinjiangbo.decorator.decorator.LanDefender;
import com.qinjiangbo.decorator.decorator.Sword;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/23/15 1:17 AM
 * Author: Richard
 */
public class TestGame {

    public static void main(String[] args) {

        Hero hero = new LanDefender(new Sword(new MasterYi()));
        System.out.println(hero.showHero());
    }
}
