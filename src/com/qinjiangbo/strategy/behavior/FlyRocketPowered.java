package com.qinjiangbo.strategy.behavior;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/9/15 2:51 PM
 * Author: Richard
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
