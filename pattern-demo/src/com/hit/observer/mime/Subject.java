package com.hit.observer.mime;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:12
 * https:github.com/guobinhit
 * description:观察者模式(主题接口)
 */
public interface Subject {
    /**
     * 此接口中包含了观察者模式必须具备的方法，包括注册观察者、移除观察者和通知观察者
     */
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
