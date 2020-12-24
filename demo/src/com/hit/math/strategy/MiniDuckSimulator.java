package com.hit.math.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * author:Charies Gavin
 * date:2017/9/17,19:57
 * https:github.com/guobinhit
 * description:策略模式（模拟测试类）
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        /**
         * 创建 Duck 实例
         */
        Duck mallarDuck = new MallarDuck();
        Duck muteDuck = new MuteDuck();
        List<Duck> duckList = new ArrayList<>();
        duckList.add(mallarDuck);
        duckList.add(muteDuck);

        /**
         * 循环
         */
        for (Duck duck : duckList) {
            MiniDuckSimulator.duckGoGO(duck);
        }

        System.out.println("----- 动态修改 Duck 的行为 -----");

        /**
         * 创建 ModelDuck，动态修改 ModelDuck 的行为
         */
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
    }

    /**
     * 封装 Duck 行为
     *
     * @param duck
     */
    private static void duckGoGO(Duck duck) {
        duck.performQuack();
        duck.performFly();
        duck.swim();
        duck.display();
    }
}
