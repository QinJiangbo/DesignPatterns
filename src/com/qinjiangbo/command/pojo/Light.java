package com.qinjiangbo.command.pojo;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 4:38 PM
 * Author: Richard
 */
public class Light {

    private String type = "";

    public Light(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " Light is on");
    }

    public void off() {
        System.out.println(type + " Light is off");
    }
}
