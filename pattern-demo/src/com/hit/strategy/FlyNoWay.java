package com.hit.strategy;

/**
 * author:Charies Gavin
 * date:2017/9/17,19:42
 * https:github.com/guobinhit
 * description:策略模式（接口实现类）
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I don't know how to fly!");
    }
}
