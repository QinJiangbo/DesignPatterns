package com.qinjiangbo.strategy.behavior;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/9/15 9:34 AM
 * Author: Richard
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence! >>");
    }
}
