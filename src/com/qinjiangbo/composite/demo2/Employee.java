package com.qinjiangbo.composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @date: 06/04/2017 4:48 PM
 * @author: qinjiangbo@github.io
 */
public abstract class Employee {

    String name;
    String title;
    int deptId;
    List<Employee> employees = new ArrayList<>();

    Employee(String name, String title, int deptId) {
        this.name = name;
        this.title = title;
        this.deptId = deptId;
    }

    abstract void add(Employee e);

    abstract void remove(Employee e);

    void work() {
        System.out.println(this.name + "-" + this.title + "-" + this.deptId);
    }

    abstract List<Employee> getEmployees();

}
