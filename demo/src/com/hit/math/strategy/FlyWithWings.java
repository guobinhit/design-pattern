package com.hit.math.strategy;

/**
 * author:Charies Gavin
 * date:2017/9/17,19:39
 * https:github.com/guobinhit
 * description:策略模式（接口实现类）
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}
