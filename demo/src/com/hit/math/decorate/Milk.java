package com.hit.math.decorate;

/**
 * author:Charies Gavin
 * date:2017/10/21,16:00
 * https:github.com/guobinhit
 * description:装饰模式
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
