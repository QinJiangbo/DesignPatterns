package com.qinjiangbo.template.methods;

/**
 * Created by IntelliJ IDEA.
 * Date: 10/25/15 10:14 PM
 * Author: Richard
 */
public abstract class CaffeineBeverage {

    // 模板方法，封装了上述的四个步骤
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 具体方法，因为这一步大家都一样
    public void boilWater() {
        System.out.println("Boiling water...");
    }

    abstract void brew();

    // 具体方法，因为这一步大家都一样
    public void pourInCup() {
        System.out.println("Pouring in cup...");
    }
    abstract void addCondiments();

}
