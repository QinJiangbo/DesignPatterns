package com.qinjiangbo.command.receiver;

/**
 * @date: 23/02/2017 9:55 PM
 * @author: qinjiangbo@github.io
 */
public class Hothub {

    private String type = "";

    public Hothub(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " Hothub is on!");
    }

    public void off() {
        System.out.println(type + " Hothub is off!");
    }
}
