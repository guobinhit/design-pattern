package com.hit.decorate;

/**
 * author:Charies Gavin
 * date:2017/10/21,16:01
 * https:github.com/guobinhit
 * description:装饰模式
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}

