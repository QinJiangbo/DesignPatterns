package com.qinjiangbo.decorator.decorator;

import com.qinjiangbo.decorator.component.Beverage;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 6:10 PM
 * Author: Richard
 */
public class Mocha extends CondimentDecorator {

    public Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "+mocha";
    }

    @Override
    public double cost() {
        return 0.99 + this.beverage.cost();
    }
}
