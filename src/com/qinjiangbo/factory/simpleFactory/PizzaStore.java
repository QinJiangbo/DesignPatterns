package com.qinjiangbo.factory.simpleFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 11:00 AM
 * Author: Richard
 */
public class PizzaStore {

    private SimpleFactory simpleFactory = new SimpleFactory();

    public PizzaStore() {
        //no args
    }

    /**
     * 预定Pizza
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {

        Pizza pizza = simpleFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
