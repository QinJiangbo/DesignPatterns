package com.qinjiangbo.composite.demo2;

import java.util.List;

/**
 * @date: 06/04/2017 4:48 PM
 * @author: qinjiangbo@github.io
 */
public class Manager extends Employee {

    public Manager(String name, String title, int deptId) {
        super(name, title, deptId);
    }

    @Override
    void add(Employee e) {
        employees.add(e);
    }

    @Override
    void remove(Employee e) {
        employees.remove(e);
    }

    @Override
    List<Employee> getEmployees() {
        return employees;
    }
}
