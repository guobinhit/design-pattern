package com.hit.math.decorate;

/**
 * author:Charies Gavin
 * date:2017/10/21,15:59
 * https:github.com/guobinhit
 * description:装饰模式
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Dacat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
