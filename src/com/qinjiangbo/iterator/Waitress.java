package com.qinjiangbo.iterator;

import java.util.Iterator;

/**
 * @date: 28/02/2017 9:27 PM
 * @author: qinjiangbo@github.io
 */
public class Waitress {

    DinerMenu dinerMenu;
    PancakeMenu pancakeMenu;

    public Waitress(DinerMenu dinerMenu, PancakeMenu pancakeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeMenu = pancakeMenu;
    }

    public void printMenu() {
        DinerMenuIterator dinerMenuIterator =
                (DinerMenuIterator) dinerMenu.createMenuIterator();
        Iterator pancakeMenuIterator =
                pancakeMenu.createMenuIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(dinerMenuIterator);
        System.out.println("\nDINER");
        printMenu(pancakeMenuIterator);

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getDescription() + " -- ");
            System.out.println(menuItem.getPrice());
        }
    }
}
