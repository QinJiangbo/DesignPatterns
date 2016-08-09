package com.qinjiangbo.factory.factoryMethod;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 10:52 AM
 * Author: Richard
 */
public class ChicagoCheesePizza extends Pizza {

    @SuppressWarnings("unchecked")
	public ChicagoCheesePizza() {
        name = "Chicago style Sauce and Cheese Pizza";
        dough = "Thin Crust dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Raggiano Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
