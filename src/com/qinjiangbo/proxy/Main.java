package com.qinjiangbo.proxy;

/**
 * @date: 23/12/2017 9:47 PM
 * @author: qinjiangbo@github.io
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("yesterday-once-more.png");

        // image will be loaded from disk
        image.display();
        // separate line
        System.out.println("==================================");
        // image will be loaded directly
        image.display();
    }
}
