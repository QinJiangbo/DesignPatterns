package com.qinjiangbo.state;

/**
 * @date: 09/04/2017 4:36 PM
 * @author: qinjiangbo@github.io
 */
public class SufficientState implements State {

    private ATM atm;

    public SufficientState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void handle() {

    }
}
