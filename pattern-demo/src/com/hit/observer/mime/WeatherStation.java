package com.hit.observer.mime;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:13
 * https:github.com/guobinhit
 * description:
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherDate);
        weatherDate.setMeasurements(80,65,30.4f);
        weatherDate.setMeasurements(78,70,35.4f);
        weatherDate.setMeasurements(82,60,25.4f);
    }
}