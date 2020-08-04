package com.hit.math.observer.api;

import java.util.Observable;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:09
 * https:github.com/guobinhit
 * description:观察者模式(继承了 Java 内置的 Observable 类)
 */
public class WeatherDateApi extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 默认构造器
     */
    public WeatherDateApi() {
    }

    public void measurementsChanged() {
        /**
         * 调用 setChanged() 标记状态已经改变的事实
         */
        setChanged();
        /**
         * 注意：Observable 内置的通知观察者方法有两个版本，分别为
         *  1）notifyObservers()
         *  2）notifyObservers(Object arg)
         * 当我们使用没有参数的 1）时，表示我们采取的获取数据的方式为"拉"
         */
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
