package com.hit.math.observer.api;


import com.hit.math.observer.mime.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:09
 * https:github.com/guobinhit
 * description:观察者模式(实现了 Java 内置的 Observer 接口以及我们自定义的展示接口)
 */
public class CurrentConditionsDisplayApi implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 有参构造器，在构造器内部注册观察者
     *
     * @param observable
     */
    public CurrentConditionsDisplayApi(Observable observable) {
        observable.addObserver(this);
    }

    /**
     * 覆盖 Observer 接口中的 update() 方法
     * 其中 obs 表示实现了可观察者的类，arg 则为传递给观察者的数据对象，可以为 null
     *
     * @param obs 可观察者实现类
     * @param arg 传递给观察者的数据对象
     */
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataApi) {
            WeatherDataApi weatherDate = (WeatherDataApi) obs;
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