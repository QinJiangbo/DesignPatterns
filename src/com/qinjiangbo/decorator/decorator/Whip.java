package com.qinjiangbo.decorator.decorator;

import com.qinjiangbo.decorator.component.Beverage;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 6:13 PM
 * Author: Richard
 */
public class Whip extends CondimentDecorator {

    public Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "+whip";
    }

    @Override
    public double cost() {
        return 0.88 + this.beverage.cost();
    }
}
