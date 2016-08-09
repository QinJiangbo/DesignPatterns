package com.qinjiangbo.template.test;

import com.qinjiangbo.template.main.Coffee;
import com.qinjiangbo.template.main.Tea;

/**
 * Created by IntelliJ IDEA.
 * Date: 10/25/15 10:26 PM
 * Author: Richard
 */
public class TeaTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("Above are about tea, following about coffee:");

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
