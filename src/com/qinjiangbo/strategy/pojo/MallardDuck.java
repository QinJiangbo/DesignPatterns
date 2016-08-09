package com.qinjiangbo.strategy.pojo;

import com.qinjiangbo.strategy.behavior.FlyWithWings;
import com.qinjiangbo.strategy.behavior.Quack;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/9/15 9:38 AM
 * Author: Richard
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real mallard duck!");
    }

}
