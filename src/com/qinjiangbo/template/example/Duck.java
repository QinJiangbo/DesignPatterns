package com.qinjiangbo.template.example;

/**
 * @date: 27/02/2017 12:20 AM
 * @author: qinjiangbo@github.io
 */
public class Duck implements Comparable {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
