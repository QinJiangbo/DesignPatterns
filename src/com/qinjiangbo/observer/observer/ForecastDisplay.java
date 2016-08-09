package com.qinjiangbo.observer.observer;

import com.qinjiangbo.observer.subject.WeatherData2;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/16/15 5:52 PM
 * Author: Richard
 */
public class ForecastDisplay implements java.util.Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    @SuppressWarnings("unused")
	private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current conditions: " + temperature + " F degrees and "+ humidity + "% humidity and pressure " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) o;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            this.pressure = weatherData2.getPressure();
            display();
        }
    }
}
