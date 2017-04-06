package com.qinjiangbo.composite.demo2;

/**
 * @date: 06/04/2017 5:02 PM
 * @author: qinjiangbo@github.io
 */
public class Client {

    public static void main(String[] args) {
        Employee CEO = new Manager("Richard", "CEO", 1);

        Employee dev1 = new Staff("Lilei", "Java", 1);
        Employee dev2 = new Staff("Leon", "Php", 1);

        Employee COO = new Manager("Amy", "COO", 2);

        Employee ops1 = new Staff("XiXi", "Linux", 2);
        Employee ops2 = new Staff("TiTi", "UNIX", 2);

        CEO.add(dev1);
        CEO.add(dev2);
        CEO.add(COO);

        COO.add(ops1);
        COO.add(ops2);

        for (Employee e : CEO.getEmployees()) {
            e.work();
            for (Employee ee : e.getEmployees()) {
                ee.work();
            }
        }
    }
}
