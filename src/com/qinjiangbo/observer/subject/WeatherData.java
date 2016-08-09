package com.qinjiangbo.observer.subject;

import com.qinjiangbo.observer.observer.Observer;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/16/15 5:00 PM
 * Author: Richard
 */

//push
public class WeatherData implements Subject {


    private ArrayList<Observer> list;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = list.indexOf(o);
        if(index != -1) {
            list.remove(index);
        }
    }

    @Override
    public int countObservers() {
        return list.size();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: list) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 设置各参数
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
