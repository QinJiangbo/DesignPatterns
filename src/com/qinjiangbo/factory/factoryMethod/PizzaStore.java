package com.qinjiangbo.factory.factoryMethod;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 11:18 AM
 * Author: Richard
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
