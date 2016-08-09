package com.qinjiangbo.strategy.behavior;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/9/15 9:35 AM
 * Author: Richard
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
