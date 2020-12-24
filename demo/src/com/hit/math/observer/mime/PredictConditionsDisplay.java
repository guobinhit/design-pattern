package com.hit.math.observer.mime;

import java.util.Random;

/**
 * author:Charies Gavin
 * date:2020/12/24,23:12
 * https:github.com/guobinhit
 * description:观察者模式(实现了观察者接口和展示接口)
 */
public class PredictConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    // 随机数
    private Random random;

    /**
     * 有参构造器，通过 Subject 类型的参数注册为观察者
     *
     * @param weatherData 主题数据
     */
    public PredictConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
        random = new Random(47);
    }

    /**
     * 覆盖 Observer 中的 update() 方法
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature + random.nextInt(10);
        this.humidity = humidity + random.nextInt(10);
        this.pressure = pressure + random.nextInt(10);
        display();
    }

    /**
     * 覆盖 DisplayElement 中的 display() 方法
     */
    @Override
    public void display() {
        System.out.println("Predict conditions: " + temperature +
                "F degrees and " + humidity + "% humidity and " + pressure + "Pa Pressure!");
    }

    @Override
    public String toString() {
        return "PredictConditionsDisplay";
    }
}
