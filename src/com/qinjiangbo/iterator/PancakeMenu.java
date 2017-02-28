package com.qinjiangbo.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @date: 28/02/2017 9:03 PM
 * @author: qinjiangbo@github.io
 */
public class PancakeMenu {

    ArrayList menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancake",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choices of blueberries or strawberries",
                true,
                3.59);

    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createMenuIterator() {
        return new PancakeMenuIterator(menuItems);
    }
}
