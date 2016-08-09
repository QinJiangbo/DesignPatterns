package com.qinjiangbo.adapter.target;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/15/15 10:35 AM
 * Author: Richard
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
