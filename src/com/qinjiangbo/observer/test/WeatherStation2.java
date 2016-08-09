package com.qinjiangbo.observer.test;

import com.qinjiangbo.observer.observer.ForecastDisplay;
import com.qinjiangbo.observer.subject.WeatherData2;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/16/15 5:21 PM
 * Author: Richard
 */
public class WeatherStation2 {

    public static void main(String[] args) {

        WeatherData2 weatherData2 = new WeatherData2();
        @SuppressWarnings("unused")
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData2);
        weatherData2.setMeasurements(80, 65, 30.4f);
    }
}
