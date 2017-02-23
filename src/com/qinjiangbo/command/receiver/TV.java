package com.qinjiangbo.command.receiver;

/**
 * @date: 23/02/2017 9:53 PM
 * @author: qinjiangbo@github.io
 */
public class TV {

    private String type = "";

    public TV(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " TV is on!");
    }

    public void off() {
        System.out.println(type + " TV is off!");
    }
}
