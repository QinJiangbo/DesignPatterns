package com.qinjiangbo.state;

/**
 * @date: 09/04/2017 4:37 PM
 * @author: qinjiangbo@github.io
 */
public class DefficientState implements State {

    private ATM atm;

    public DefficientState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void handle() {
        if (DB.query() > 0) {
            DB.take(1000);
            atm.setState(new SufficientState(atm));
            System.out.println("$1000 HAVE BEEN TAKEN!");
        } else {
            System.out.println("NOT SUFFICIENT IS AVAILABLE!");
        }
    }
}
