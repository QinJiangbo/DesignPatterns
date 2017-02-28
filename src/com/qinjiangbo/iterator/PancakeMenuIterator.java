package com.qinjiangbo.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @date: 28/02/2017 9:28 PM
 * @author: qinjiangbo@github.io
 */
public class PancakeMenuIterator implements Iterator {

    ArrayList menuItems;
    int position = 0;

    public PancakeMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size()
                && menuItems.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position++);
        return menuItem;
    }
}
