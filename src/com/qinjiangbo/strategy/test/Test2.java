package com.qinjiangbo.strategy.test;

import com.qinjiangbo.strategy.pojo.Duck;
import com.qinjiangbo.strategy.behavior.FlyRocketPowered;
import com.qinjiangbo.strategy.pojo.ModelDuck;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/9/15 2:52 PM
 * Author: Richard
 */
public class Test2 {

    public static void main(String[] args) {

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
