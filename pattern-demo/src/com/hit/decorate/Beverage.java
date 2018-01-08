package com.hit.decorate;

/**
 * author:Charies Gavin
 * date:2017/10/21,15:58
 * https:github.com/guobinhit
 * description:装饰模式（饮料抽象类）
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
