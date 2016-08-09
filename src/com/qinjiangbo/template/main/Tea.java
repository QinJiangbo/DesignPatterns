package com.qinjiangbo.template.main;

/**
 * Created by IntelliJ IDEA.
 * Date: 10/25/15 10:22 PM
 * Author: Richard
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding the condiments...");
    }
}
