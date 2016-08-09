package com.qinjiangbo.observer.test;

import com.qinjiangbo.observer.observer.CurrentConditionDisplay;
import com.qinjiangbo.observer.subject.WeatherData;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/16/15 5:21 PM
 * Author: Richard
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        @SuppressWarnings("unused")
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
