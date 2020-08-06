package com.hit.math.pattern;

import com.hit.math.decorate.*;

/**
 * author:Charies Gavin
 * date:2020/8/6, 22:50
 * https://github.com/guobinhit
 * description:策略模式
 */
public class DecorateTest {
    public static void main(String[] args) {
        /**
         * 装饰模式：
         * 缺点，子类比较多，繁杂；
         * 优点，组合方便，使用灵活。
         */
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Decat();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        Beverage beverage4 = new DarkRoast();
        beverage4 = new Whip(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
    }
}
