package com.qinjiangbo.proxy;

/**
 * @date: 23/12/2017 9:46 PM
 * @author: qinjiangbo@github.io
 * @description:
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
