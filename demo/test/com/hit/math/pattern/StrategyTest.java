package com.hit.math.pattern;

import com.hit.math.strategy.*;

import java.util.ArrayList;
import java.util.List;

/**
 * author:Charies Gavin
 * date:2020/8/6, 22:30
 * https://github.com/guobinhit
 * description:策略模式
 */
public class StrategyTest {
    public static void main(String[] args) {
        /**
         * 创建 Duck 实例
         */
        Duck mallarDuck = new MallarDuck();
        Duck muteDuck = new MuteDuck();
        Duck modelDuck = new ModelDuck();
        List<Duck> duckList = new ArrayList<>();
        duckList.add(mallarDuck);
        duckList.add(muteDuck);
        duckList.add(modelDuck);

        /**
         * 循环打印鸭子行为
         */
        for (int i = 0; i < duckList.size(); i++) {
            StrategyTest.duckGoGO(duckList.get(i));
            if (i != duckList.size() - 1) {
                System.out.println("  --- --- ---  ");
            }
        }

        System.out.println("----- 动态修改 Duck 的行为 -----");

        /**
         * 创建 ModelDuck，动态修改 ModelDuck 的行为
         */
        Duck modelDuck2 = new ModelDuck();
        modelDuck2.performFly();
        modelDuck2.setFlyBehavior(new FlyWithWings());
        modelDuck2.performFly();
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
