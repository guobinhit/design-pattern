package com.hit.math.strategy;

/**
 * author:Charies Gavin
 * date:2017/9/17,19:33
 * https:github.com/guobinhit
 * description:策略模式（抽象行为接口）
 */
public interface QuackBehavior {
    /**
     * 接口中的变量默认被 public static final 修饰
     * 接口中的方法默认被 public abstract 修饰
     */
    void quack();
}
