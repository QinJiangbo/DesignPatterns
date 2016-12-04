package com.qinjiangbo.decorator.decorator;

import com.qinjiangbo.decorator.component.Beverage;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 6:01 PM
 * Author: Richard
 */
public abstract class CondimentDecorator extends Beverage {
    //重新实现getDescription方法
    public abstract String getDescription();
}
