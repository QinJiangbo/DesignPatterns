package com.qinjiangbo.composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @date: 06/04/2017 4:49 PM
 * @author: qinjiangbo@github.io
 */
public class Staff extends Employee {

    public Staff(String name, String title, int deptId) {
        super(name, title, deptId);
    }

    @Override
    void add(Employee e) {
        throw new UnsupportedOperationException();
    }

    @Override
    void remove(Employee e) {
        throw new UnsupportedOperationException();
    }

    @Override
    List<Employee> getEmployees() {
        return new ArrayList<>();
    }
}
