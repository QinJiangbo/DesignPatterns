package com.qinjiangbo.decorator.component;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 5:59 PM
 * Author: Richard
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.25;
    }

}
