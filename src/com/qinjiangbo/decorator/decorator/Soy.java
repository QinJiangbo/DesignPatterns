package com.qinjiangbo.decorator.decorator;

import com.qinjiangbo.decorator.component.Beverage;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 6:11 PM
 * Author: Richard
 */
public class Soy extends Condiment {

    public Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "+soy";
    }

    @Override
    public double cost() {
        return 0.68 + this.beverage.cost();
    }
}
