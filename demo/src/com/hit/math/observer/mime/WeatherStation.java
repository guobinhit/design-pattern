package com.hit.math.observer.mime;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:13
 * https:github.com/guobinhit
 * description:观察者模式(气象站)
 */
public class WeatherStation {
    public static void main(String[] args) {
        // 创建 WeatherDate 对象，用于传递给 CurrentConditionsDisplay 的构造器
        WeatherDate weatherDate = new WeatherDate();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherDate);
        // 展示初始化布告板
        conditionsDisplay.display();
        // 更新布告板
        conditionsDisplay.update(88,78,32.4f);
        // 修改布告板数据
        weatherDate.setMeasurements(80,65,30.4f);
    }
}