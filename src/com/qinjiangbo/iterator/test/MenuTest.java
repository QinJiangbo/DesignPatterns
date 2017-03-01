package com.qinjiangbo.iterator.test;

import com.qinjiangbo.iterator.menu.DinerMenu;
import com.qinjiangbo.iterator.menu.PancakeMenu;

/**
 * @date: 28/02/2017 9:45 PM
 * @author: qinjiangbo@github.io
 */
public class MenuTest {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeMenu pancakeMenu = new PancakeMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeMenu);

        waitress.printMenu();
    }
}
