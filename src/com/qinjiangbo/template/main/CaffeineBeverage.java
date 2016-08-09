package com.qinjiangbo.template.main;

/**
 * Created by IntelliJ IDEA.
 * Date: 10/25/15 10:14 PM
 * Author: Richard
 */
public abstract class CaffeineBeverage {

    //template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    abstract void brew();

    public void pourInCup() {
        System.out.println("Pouring in cup...");
    }
    abstract void addCondiments();

}
