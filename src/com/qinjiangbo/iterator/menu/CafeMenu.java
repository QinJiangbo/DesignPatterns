package com.qinjiangbo.iterator.menu;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @date: 01/03/2017 9:39 AM
 * @author: qinjiangbo@github.io
 */
public class CafeMenu implements Menu {

    private Hashtable menuItems;

    public CafeMenu() {
        menuItems = new Hashtable();

        addItem("Veggie Burger and Air fries",
                "(Fakin) Bacon with lettuce & tomato on the whole wheat",
                true,
                3.99);

        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.69);

        addItem("Burrito",
                "A large burrito, with pinto beans",
                true,
                4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createMenuIterator() {
        return menuItems.values().iterator();
    }
}
