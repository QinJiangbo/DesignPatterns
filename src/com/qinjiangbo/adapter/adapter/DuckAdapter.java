package com.qinjiangbo.adapter.adapter;

import com.qinjiangbo.adapter.adaptee.Turkey;
import com.qinjiangbo.adapter.target.Duck;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/15/15 10:48 AM
 * Author: Richard
 */
public class DuckAdapter implements Turkey {

    Duck duck;
    Random random = new Random();

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
