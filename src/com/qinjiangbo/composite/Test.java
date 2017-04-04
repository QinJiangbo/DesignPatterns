package com.qinjiangbo.composite;

/**
 * @date: 03/04/2017 11:50 PM
 * @author: qinjiangbo@github.io
 */
public class Test {

    public static void main(String[] args) {
        MenuComponent pancakeMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Diner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "all menu");
        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem("Gong Bao Ji Ding", "An old food",
                true, 20.32));

        cafeMenu.add(new MenuItem("Starbucks", "coffee",
                false, 16.00));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        System.out.println("====================");

        dinerMenu.remove(new MenuItem("Gong Bao Ji Ding", "An old food",
                true, 20.32));
        waitress.printMenu();

    }
}
