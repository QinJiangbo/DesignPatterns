package com.qinjiangbo.state;

/**
 * @date: 09/04/2017 4:57 PM
 * @author: qinjiangbo@github.io
 */
public class Client {

    public static void main(String[] args) {
        ATM atm = new ATM();
        // 模拟11次取款行为，每次1000
        for (int i = 0; i < 11; i++) {
            atm.withdraw();
        }
    }
}
