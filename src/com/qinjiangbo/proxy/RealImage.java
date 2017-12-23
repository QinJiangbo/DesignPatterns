package com.qinjiangbo.proxy;

/**
 * @date: 23/12/2017 9:45 PM
 * @author: qinjiangbo@github.io
 * @description:
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
