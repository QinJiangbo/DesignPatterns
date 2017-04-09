package com.qinjiangbo.state;

/**
 * @date: 09/04/2017 4:28 PM
 * @author: qinjiangbo@github.io
 */
public class ATM {

    private State state;
    private int count = 10000;

    public ATM() {
        state = new SufficientState(this);
    }

    public void withdraw() {
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }

}
