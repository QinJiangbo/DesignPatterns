package com.qinjiangbo.strategy.pojo;

import com.qinjiangbo.strategy.behavior.FlyBehavior;
import com.qinjiangbo.strategy.behavior.QuackBehavior;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/9/15 9:36 AM
 * Author: Richard
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
