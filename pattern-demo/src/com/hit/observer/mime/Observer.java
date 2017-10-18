package com.hit.observer.mime;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:12
 * https:github.com/guobinhit
 * description:
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
