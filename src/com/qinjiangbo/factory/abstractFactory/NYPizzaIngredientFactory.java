package com.qinjiangbo.factory.abstractFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 3:40 PM
 * Author: Richard
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

}
