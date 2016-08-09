package com.qinjiangbo.adapter.test;

import com.qinjiangbo.adapter.adaptee.Turkey;
import com.qinjiangbo.adapter.adapter.DuckAdapter;
import com.qinjiangbo.adapter.adapter.TurkeyAdapter;
import com.qinjiangbo.adapter.adaptee.WildTurkey;
import com.qinjiangbo.adapter.target.Duck;
import com.qinjiangbo.adapter.target.MallardDuck;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/15/15 10:28 AM
 * Author: Richard
 */
public class Client {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turketAdapter = new TurkeyAdapter(wildTurkey);
        Turkey duckAdapter = new DuckAdapter(mallardDuck);

        System.out.println("The turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println();

        System.out.println("The duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println();

        System.out.println("The turkey adapter says...");
        turketAdapter.quack();
        turketAdapter.fly();

        System.out.println();

        System.out.println("The duck adapter says...");
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
