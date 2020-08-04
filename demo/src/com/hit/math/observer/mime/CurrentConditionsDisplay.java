package com.hit.math.observer.mime;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:12
 * https:github.com/guobinhit
 * description:观察者模式(实现了观察者接口和展示接口)
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherDate;

    /**
     * 有参构造器，通过 Subject 类型的参数注册为观察者
     * @param weatherDate
     */
    public CurrentConditionsDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    /**
     * 覆盖 Observer 中的 update() 方法
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    /**
     * 覆盖 DisplayElement 中的 display() 方法
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity and " + pressure + "Pa Pressure!");
    }
}
