package com.qinjiangbo.command.receiver;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 4:58 PM
 * Author: Richard
 */
public class Stereo {

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("CD is playing...");
    }

    public void setDvd() {
        System.out.println("DVD is playing...");
    }

    public void setRadio() {
        System.out.println("Radio id playing...");
    }

    public void setVolume(int volume) {
        System.out.println("Volume is " + volume);
    }
}
