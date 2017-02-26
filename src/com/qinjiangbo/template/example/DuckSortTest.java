package com.qinjiangbo.template.example;

import java.util.Arrays;

/**
 * @date: 27/02/2017 12:23 AM
 * @author: qinjiangbo@github.io
 */
public class DuckSortTest {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting...");
        display(ducks);

        /* template method */
        Arrays.sort(ducks);

        System.out.println("\nAfter sorting...");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck.toString());
        }
    }
}
