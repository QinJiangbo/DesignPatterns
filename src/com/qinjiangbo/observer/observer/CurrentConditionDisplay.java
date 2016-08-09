package com.qinjiangbo.observer.observer;

import com.qinjiangbo.observer.subject.Subject;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/16/15 5:15 PM
 * Author: Richard
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current conditions: " + temperature + " F degrees and "+ humidity + "% humidity and pressure " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
