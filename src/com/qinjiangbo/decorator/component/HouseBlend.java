package com.qinjiangbo.decorator.component;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 5:58 PM
 * Author: Richard
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.50;
    }
}
