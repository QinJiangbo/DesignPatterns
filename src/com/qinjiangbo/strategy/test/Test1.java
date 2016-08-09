package com.qinjiangbo.strategy.test;

import com.qinjiangbo.strategy.pojo.Duck;
import com.qinjiangbo.strategy.pojo.MallardDuck;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/9/15 9:41 AM
 * Author: Richard
 */
public class Test1 {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
