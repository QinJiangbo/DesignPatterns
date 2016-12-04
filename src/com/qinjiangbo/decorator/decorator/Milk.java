package com.qinjiangbo.decorator.decorator;

import com.qinjiangbo.decorator.component.Beverage;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 6:04 PM
 * Author: Richard
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "+milk";
    }

    @Override
    public double cost() {
        return 0.55 + this.beverage.cost();
    }
}
