package com.qinjiangbo.strategy.pojo;

import com.qinjiangbo.strategy.behavior.FlyNoWay;
import com.qinjiangbo.strategy.behavior.Quack;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/9/15 2:49 PM
 * Author: Richard
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }

}
