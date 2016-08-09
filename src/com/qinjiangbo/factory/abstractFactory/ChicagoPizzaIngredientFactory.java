package com.qinjiangbo.factory.abstractFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 3:52 PM
 * Author: Richard
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
