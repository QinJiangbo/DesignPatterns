package com.qinjiangbo.factory.simpleFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 10:55 AM
 * Author: Richard
 */
public class SimpleFactory {

    private Pizza pizza;

    public SimpleFactory() {
        //no args
    }

    /**
     * 生产Pizza对象
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {

        if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        }
        else if (type.equals("Clam")) {
            pizza = new ClamPizza();
        }
        else if (type.equals("Veggie")) {
            pizza = new VeggiePizza();
        }
        else if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        }
        else {
            System.out.println("Invalid Type!");
        }
        return pizza;
    }
}
