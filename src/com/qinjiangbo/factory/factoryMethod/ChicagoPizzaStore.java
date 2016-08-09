package com.qinjiangbo.factory.factoryMethod;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 11:37 AM
 * Author: Richard
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Pepperoni")) {
            return new ChicagoPepperoniPizza();
        }
        else if (type.equals("Clam")) {
            return new ChicagoClamPizza();
        }
        else if (type.equals("Veggie")) {
            return new ChicagoVeggiePizza();
        }
        else if (type.equals("Cheese")) {
            return new ChicagoCheesePizza();
        }
        else {
            System.out.println("Invalid Type!");
            return null;
        }
    }
}
