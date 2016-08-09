package com.qinjiangbo.factory.test;

import com.qinjiangbo.factory.simpleFactory.PizzaStore;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 11:06 AM
 * Author: Richard
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore();

        pizzaStore.orderPizza("Veggie");
    }
}
