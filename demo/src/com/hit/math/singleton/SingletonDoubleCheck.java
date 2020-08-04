package com.hit.math.singleton;

/**
 * author:Charies Gavin
 * date:2017/9/16,22:17
 * https:github.com/guobinhit
 * description:单例模式（多重检查加锁，可用于多线程）
 */
public class SingletonDoubleCheck {
    /**
     * volatile 关键字确保当 uniqueInstance 变量被初始化为 SingletonDoubleCheck 实例时，
     * 多个线程正确地处理 uniqueInstance 变量
     */
    private volatile static SingletonDoubleCheck uniqueInstance;

    /**
     * 私有化构造方法
     */
    private SingletonDoubleCheck() {
    }

    /**
     * 提供获取实例的公共静态方法。
     * 检查实例时，如果不存在，就进入同步块，同步块的锁为 SingletonDoubleCheck.class
     *
     * @return SingletonDoubleCheck
     */
    public static SingletonDoubleCheck getInstance() {
        /**
         * 注意：只有第一次才彻底执行这里的代码
         */
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheck.class) {
                /**
                 * 进入同步块后，再检查一次，如果仍是 null，则创建实例
                 */
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheck();
                }
            }
        }
        return uniqueInstance;
    }
}
