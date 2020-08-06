package com.hit.math.strategy;

/**
 * author:Charies Gavin
 * date:2017/9/17,19:43
 * https:github.com/guobinhit
 * description:策略模式（接口实现类）
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack, quack, quack...");
    }
}
