package com.qinjiangbo.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @date: 03/04/2017 11:40 PM
 * @author: qinjiangbo@github.io
 */
public class Menu extends MenuComponent {

    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n " + getName());
        System.out.println(",  " + getDescription());
        System.out.println("---------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
                    (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
