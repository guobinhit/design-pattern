package com.hit.math.observer.mime;

import java.util.ArrayList;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:13
 * https:github.com/guobinhit
 * description:观察者模式(实现了主题接口)
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 默认构造器
     */
    public WeatherData() {
        /**
         * 创建观察者列表
         */
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
            System.out.println("observer of " + observer + " be updated.");
        }
    }

    /**
     * 调用通知观察者方法，通知所有观察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 设置气象观测数据
     *
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
