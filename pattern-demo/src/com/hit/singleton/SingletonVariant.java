package com.hit.singleton;

/**
 * author:Charies Gavin
 * date:2017/9/16,22:04
 * https://github.com/guobinhit
 * description:单例模式（急切实例化）
 */
public class SingletonVariant {
    private static SingletonVariant uniqueInstance = new SingletonVariant();

    /**
     * 私有化构造函数
     */
    private SingletonVariant() {
    }

    /**
     * 提供获取实例的公共静态方法
     *
     * @return SingletonVariant
     */
    public static SingletonVariant getInstance() {
        return uniqueInstance;
    }
}
