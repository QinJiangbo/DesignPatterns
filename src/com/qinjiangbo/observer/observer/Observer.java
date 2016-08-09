package com.qinjiangbo.observer.observer;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/16/15 4:56 PM
 * Author: Richard
 */
public interface Observer {

    //更新天气信息
    public void update(float temp, float humidity, float pressure);
}
