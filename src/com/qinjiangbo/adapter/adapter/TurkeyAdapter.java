package com.qinjiangbo.adapter.adapter;

import com.qinjiangbo.adapter.adaptee.Turkey;
import com.qinjiangbo.adapter.target.Duck;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/15/15 10:38 AM
 * Author: Richard
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
