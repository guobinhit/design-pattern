package com.hit.math.decorate;

/**
 * author:Charies Gavin
 * date:2017/10/21,16:00
 * https:github.com/guobinhit
 * description:装饰模式（摩卡，继承口味装饰类）
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
