package com.qinjiangbo.state;

/**
 * @date: 09/04/2017 4:52 PM
 * @author: qinjiangbo@github.io
 */
public class DB {

    private static int total = 10000;

    public static int take(int num) {
        total = total - num;
        return total;
    }

    public static int query() {
        return total;
    }

}
