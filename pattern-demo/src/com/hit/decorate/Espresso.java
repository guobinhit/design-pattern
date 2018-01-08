package com.hit.decorate;

/**
 * author:Charies Gavin
 * date:2017/10/21,15:59
 * https:github.com/guobinhit
 * description:装饰模式
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

