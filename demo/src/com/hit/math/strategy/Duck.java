package com.hit.math.strategy;

/**
 * author:Charies Gavin
 * date:2017/9/17,19:45
 * https:github.com/guobinhit
 * description:策略模式（抽象类）
 */
public abstract class Duck {

    /**
     * 多用组合，少用继承，增加代码灵活性
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * 无参构造器，也可以称之为默认构造器
     */
    public Duck() {
    }

    /**
     * 将方法用 abstract 修饰，强制导出类必须覆盖此方法
     */
    public abstract void display();

    /**
     * 通用执行方法，只要是 FlyBehavior 的实现类，都可以调用此方法
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 通用执行方法，只要是 QuackBehavior 的实现类，都可以调用此方法
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 动态设置鸭子的 FlyBehavior
     *
     * @param fb FlyBehavior 实现类
     */
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    /**
     * 动态设置鸭子的 QuackBehavior
     *
     * @param qb QuackBehavior 实现类
     */
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All duck float, even decoys!");
    }
}
