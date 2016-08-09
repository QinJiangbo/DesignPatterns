package com.qinjiangbo.factory.factoryMethod;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 11:17 AM
 * Author: Richard
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    @SuppressWarnings("rawtypes")
	ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes");
    }

    void cut() {
        System.out.println("cut the pizza into triangle slices");
    }

    void box() {
        System.out.println("Place pizza in a box");
    }

    public String getName() {
        return this.name;
    }
}
