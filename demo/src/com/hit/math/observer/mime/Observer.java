package com.hit.math.observer.mime;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:12
 * https:github.com/guobinhit
 * description:观察者模式(观察者接口)
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
