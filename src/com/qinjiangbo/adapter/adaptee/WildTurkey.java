package com.qinjiangbo.adapter.adaptee;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/15/15 10:36 AM
 * Author: Richard
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Goggle goggle");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
