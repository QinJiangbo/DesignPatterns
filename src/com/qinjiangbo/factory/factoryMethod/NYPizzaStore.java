package com.qinjiangbo.factory.factoryMethod;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 11:37 AM
 * Author: Richard
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Pepperoni")) {
            return new NYPepperoniPizza();
        }
        else if (type.equals("Clam")) {
            return new NYClamPizza();
        }
        else if (type.equals("Veggie")) {
            return new NYVeggiePizza();
        }
        else if (type.equals("Cheese")) {
            return new NYCheesePizza();
        }
        else {
            System.out.println("Invalid Type!");
            return null;
        }
    }
}
