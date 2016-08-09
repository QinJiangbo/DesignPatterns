package com.qinjiangbo.factory.test;

import com.qinjiangbo.factory.factoryMethod.ChicagoPizzaStore;
import com.qinjiangbo.factory.factoryMethod.PizzaStore;
import com.qinjiangbo.factory.factoryMethod.NYPizzaStore;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 11:45 AM
 * Author: Richard
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("Cheese");
        chicagoStore.orderPizza("Cheese");
    }
}
