package com.qinjiangbo.observer.subject;

import java.util.Observable;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/16/15 5:45 PM
 * Author: Richard
 */

//pull
public class WeatherData2 extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData2() {}

    public void measurementsChanged() {
        setChanged();
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

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
