package com.hit.observer.mime;

/**
 * author:Charies Gavin
 * date:2017/10/18,23:12
 * https:github.com/guobinhit
 * description:
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
