package com.qinjiangbo.state;

/**
 * @date: 09/04/2017 4:28 PM
 * @author: qinjiangbo@github.io
 */
public class ATM {

    private State state;
    private int count;

    public ATM() {
        count = 100000;
        state = new EnoughState();
    }

    public void withdraw(int number) {

    }

}
