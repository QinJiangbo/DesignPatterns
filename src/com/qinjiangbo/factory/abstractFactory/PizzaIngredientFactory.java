package com.qinjiangbo.factory.abstractFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 3:35 PM
 * Author: Richard
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

}
