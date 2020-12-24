package com.hit.math.observer.mime;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:13
 * https:github.com/guobinhit
 * description:观察者模式(气象站)
 */
public class WeatherStation {
    public static void main(String[] args) {
        // 创建 WeatherData 对象，用于传递给观察者实现类的构造器
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        PredictConditionsDisplay predictConditionsDisplay = new PredictConditionsDisplay(weatherData);
        // 展示初始化布告板
        currentConditionsDisplay.display();
        // 更新布告板
        currentConditionsDisplay.update(88, 78, 32.4f);
        // 修改布告板数据
        weatherData.setMeasurements(80, 65, 30.4f);

        /**
         * 实际上，在修改 currentConditionsDisplay 的时候，
         * predictConditionsDisplay 就会得到通知，再次输出一遍，用于对比
         */
        predictConditionsDisplay.display();
    }
}