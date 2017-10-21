package com.hit.decorate;

/**
 * author:Charies Gavin
 * date:2017/10/21,16:00
 * https:github.com/guobinhit
 * description:
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
