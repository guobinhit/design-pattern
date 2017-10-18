package com.hit.observer.javapi;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:10
 * https:github.com/guobinhit
 * description:
 */
public class WeatherStationApi {
    public static void main(String[] args) {
        WeatherDateApi weatherDate = new WeatherDateApi();
        CurrentConditionsDisplayApi conditionsDisplay = new CurrentConditionsDisplayApi(weatherDate);
        weatherDate.setMeasurements(80,65,30.4f);
        weatherDate.setMeasurements(78,70,35.4f);
        weatherDate.setMeasurements(82,60,25.4f);
    }
}
