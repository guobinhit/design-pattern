package com.hit.math.pattern;

import com.hit.math.observer.api.CurrentConditionsDisplayApi;
import com.hit.math.observer.api.WeatherDataApi;
import com.hit.math.observer.mime.CurrentConditionsDisplay;
import com.hit.math.observer.mime.WeatherData;

/**
 * author:Charies Gavin
 * date:2020/8/6, 22:50
 * https://github.com/guobinhit
 * description:观察者模式
 */
public class ObserverTest {
    public static void main(String[] args) {
        ObserverTest.testObserverMime();
        System.out.println("  --- 以上是自己实现 & 以下是内置实现 ---  ");
        ObserverTest.testObserverApi();
    }

    /**
     * 测试自己实现的观察者模式
     */
    private static void testObserverMime() {
        // 创建 WeatherData 对象，用于传递给 CurrentConditionsDisplay 的构造器
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // 展示初始化布告板
        conditionsDisplay.display();
        // 更新布告板
        conditionsDisplay.update(88, 78, 32.4f);
        // 修改布告板数据
        weatherData.setMeasurements(80, 65, 30.4f);

        System.out.println("  --- --- ---  ");

        CurrentConditionsDisplay conditionsDisplay2 = new CurrentConditionsDisplay(weatherData);
        // 展示初始化布告板
        conditionsDisplay2.display();
        // 更新布告板
        conditionsDisplay2.update(92, 68, 35.4f);
        // 修改布告板数据
        weatherData.setMeasurements(110, 119, 12.0f);
    }

    /**
     * 测试通过 Java 内置 API 实现的观察者模式
     */
    private static void testObserverApi() {
        WeatherDataApi weatherData = new WeatherDataApi();
        CurrentConditionsDisplayApi conditionsDisplay = new CurrentConditionsDisplayApi(weatherData);
        // 展示初始化布告板
        conditionsDisplay.display();
        // 更新布告板，仍然皆为初始化值
        conditionsDisplay.update(weatherData, null);
        // 修改布告板数据
        weatherData.setMeasurements(80, 65, 30.4f);

        System.out.println("  --- --- ---  ");

        CurrentConditionsDisplayApi conditionsDisplay2 = new CurrentConditionsDisplayApi(weatherData);
        // 展示初始化布告板
        conditionsDisplay2.display();
        // 更新布告板，仍然皆为初始化值
        conditionsDisplay2.update(weatherData, null);
        // 修改布告板数据
        weatherData.setMeasurements(110, 119, 12.0f);
    }
}
