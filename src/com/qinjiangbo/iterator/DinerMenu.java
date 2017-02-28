package com.qinjiangbo.iterator;

import java.util.Iterator;

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

        addItem("Vegetarian BLT",
                "(Fakin) Bacon with lettuce & tomato on the whole wheat",
                true,
                2.99);

        addItem("BLT",
                "Bacon with lettuce & tomato on the whole wheat",
                false,
                2.99);

        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29);

        addItem("Hotdog",
                "A hot dog",
                false,
                3.05);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_SIZE) {
            System.err.println("Sorry, menu is full! Can't add items!");
        } else {
            menuItems[numberOfItems++] = menuItem;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createMenuIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
