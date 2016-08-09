package com.qinjiangbo.decorator.component;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 6:00 PM
 * Author: Richard
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Escpresso";
    }

    @Override
    public double cost() {
        return 2.45;
    }
}
