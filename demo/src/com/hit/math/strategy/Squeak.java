package com.hit.math.strategy;

/**
 * author:Charies Gavin
 * date:2017/9/17,19:44
 * https:github.com/guobinhit
 * description:策略模式（接口实现类）
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak, squeak, squeak...");
    }
}
