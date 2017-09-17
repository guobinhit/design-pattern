package com.hit.singleton;

/**
 * author:Charies Gavin
 * date:2017/9/16,21:56
 * https:github.com/guobinhit
 * description:经典单例模式（延迟实例化）
 */
public class Singleton {
    private static Singleton uniqueInstance;

    /**
     * 私有化构造函数
     */
    private Singleton() {
    }

    /**
     * 提供获取实例的公共静态方法
     *
     * @return Singleton
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return new Singleton();
    }
}
