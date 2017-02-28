package com.qinjiangbo.iterator;

/**
 * @date: 28/02/2017 9:03 PM
 * @author: qinjiangbo@github.io
 */
public class DinerMenu {

    private static final int MAX_SIZE = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_SIZE];

    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems[numberOfItems++] = menuItem;
    }
}
