package com.qinjiangbo.strategy.behavior;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/9/15 9:32 AM
 * Author: Richard
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
