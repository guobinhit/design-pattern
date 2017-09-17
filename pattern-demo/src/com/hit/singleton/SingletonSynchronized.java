package com.hit.singleton;

/**
 * author:Charies Gavin
 * date:2017/9/16,22:09
 * https:github.com/guobinhit
 * description:单例模式（增加 synchronized 同步关键字，可用于多线程）
 */
public class SingletonSynchronized {
    private static SingletonSynchronized uniqueInstance;

    /**
     * 私有化构造函数
     */
    private SingletonSynchronized() {
    }

    /**
     * 提供获取实例的公共静态同步方法。
     * 通过增加 synchronized 关键字到 getInstance() 方法中，
     * 我们迫使每个线程在进入这个方法之前，都要先等候别的线程离开该方法。
     * 也就是说，不会有两个线程同时进入这个方法。
     *
     * @return SingletonSynchronized
     */
    public static synchronized SingletonSynchronized getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
        }
        return uniqueInstance;
    }
}