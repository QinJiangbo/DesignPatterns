package com.qinjiangbo.template.main;

/**
 * Created by IntelliJ IDEA.
 * Date: 10/25/15 10:23 PM
 * Author: Richard
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and Milk...");
    }
}
