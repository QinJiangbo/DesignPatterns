package com.qinjiangbo.factory.factoryMethod;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 10:52 AM
 * Author: Richard
 */
public class NYCheesePizza extends Pizza {

    @SuppressWarnings("unchecked")
	public NYCheesePizza() {
        name = "NY style Sauce and Cheese Pizza";
        dough = "Thin Crust dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Raggiano Cheese");
    }
}
