package com.qinjiangbo.decorator.test;

import com.qinjiangbo.decorator.component.DarkRoast;
import com.qinjiangbo.decorator.component.Beverage;
import com.qinjiangbo.decorator.decorator.Milk;
import com.qinjiangbo.decorator.decorator.Soy;
import com.qinjiangbo.decorator.decorator.Whip;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 8:51 PM
 * Author: Richard
 */
public class TestDecorator {

    public static void main(String[] args) {
        Beverage beverage = new Whip(new Soy(new Milk(new DarkRoast())));
        System.out.println(beverage.getDescription());
    }
}
