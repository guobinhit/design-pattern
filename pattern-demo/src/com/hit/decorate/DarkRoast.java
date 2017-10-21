package com.hit.decorate;

/**
 * author:Charies Gavin
 * date:2017/10/21,15:58
 * https:github.com/guobinhit
 * description:
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffer";
    }

    @Override
    public double cost() {
        return 0.90;
    }
}
