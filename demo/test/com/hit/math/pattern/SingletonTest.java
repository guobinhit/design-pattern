package com.hit.math.pattern;

import com.hit.math.singleton.Singleton;
import com.hit.math.singleton.SingletonDoubleCheck;
import com.hit.math.singleton.SingletonSynchronized;
import com.hit.math.singleton.SingletonVariant;

/**
 * author:Charies Gavin
 * date:2020/8/4, 23:00
 * https://github.com/guobinhit
 * description:单例模式
 */
public class SingletonTest {
    public static void main(String[] args) {
        // 经典单例模式（延迟实例化）
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.equals(singleton2));
        // 单例模式（急切实例化）
        SingletonVariant singletonVariant = SingletonVariant.getInstance();
        SingletonVariant singletonVariant2 = SingletonVariant.getInstance();
        System.out.println(singletonVariant.equals(singletonVariant2));
        // 单例模式（增加 synchronized 同步关键字，可用于多线程）
        SingletonSynchronized singletonSynchronized = SingletonSynchronized.getInstance();
        SingletonSynchronized singletonSynchronized2 = SingletonSynchronized.getInstance();
        System.out.println(singletonSynchronized.equals(singletonSynchronized2));
        // 单例模式（多重检查加锁，可用于多线程）
        SingletonDoubleCheck singletonDoubleCheck = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck singletonDoubleCheck2 = SingletonDoubleCheck.getInstance();
        System.out.println(singletonDoubleCheck.equals(singletonDoubleCheck2));
    }
}
