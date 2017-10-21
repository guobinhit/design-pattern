package com.hit.decorate;

/**
 * author:Charies Gavin
 * date:2017/10/21,16:00
 * https:github.com/guobinhit
 * description:
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
