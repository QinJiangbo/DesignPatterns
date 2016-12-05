package com.qinjiangbo.singleton;

/**
 * @date: 05/12/2016 10:59 PM
 * @author: qinjiangbo@github.io
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingletonInstance();
        Singleton singleton2 = Singleton.getSingletonInstance();
        System.out.println(singleton1 == singleton2);
    }
}
