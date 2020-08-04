package com.hit.math.observer.api;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:10
 * https:github.com/guobinhit
 * description:观察者模式(气象站)
 */
public class WeatherStationApi {
    public static void main(String[] args) {
        WeatherDateApi weatherDate = new WeatherDateApi();
        CurrentConditionsDisplayApi conditionsDisplay = new CurrentConditionsDisplayApi(weatherDate);
        // 展示初始化布告板
        conditionsDisplay.display();
        // 更新布告板，仍然皆为初始化值
        conditionsDisplay.update(weatherDate,null);
        // 修改布告板数据
        weatherDate.setMeasurements(80,65,30.4f);
    }
}
