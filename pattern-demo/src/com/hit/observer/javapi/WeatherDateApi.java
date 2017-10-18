package com.hit.observer.javapi;

import java.util.Observable;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:09
 * https:github.com/guobinhit
 * description:
 */
public class WeatherDateApi extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDateApi() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

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
