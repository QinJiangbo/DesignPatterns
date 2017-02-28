package com.qinjiangbo.iterator;

import java.util.Iterator;

/**
 * @date: 28/02/2017 9:28 PM
 * @author: qinjiangbo@github.io
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length
                && menuItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position++];
        return menuItem;
    }
}
