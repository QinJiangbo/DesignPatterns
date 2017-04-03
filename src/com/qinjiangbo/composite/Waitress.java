package com.qinjiangbo.composite;

/**
 * @date: 03/04/2017 11:47 PM
 * @author: qinjiangbo@github.io
 */
public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
