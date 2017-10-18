package com.hit.observer.javapi;

import com.hit.observer.mime.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:09
 * https:github.com/guobinhit
 * description:
 */
public class CurrentConditionsDisplayApi implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplayApi(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDateApi) {
            WeatherDateApi weatherDate = (WeatherDateApi) obs;
            this.temperature = weatherDate.getTemperature();
            this.humidity = weatherDate.getHumidity();
            this.pressure = weatherDate.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity and " + pressure + "Pa Pressure!");
    }
}