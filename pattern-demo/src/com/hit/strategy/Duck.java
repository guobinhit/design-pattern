package com.hit.strategy;

/**
 * author:Charies Gavin
 * date:2017/9/17,19:45
 * https:github.com/guobinhit
 * description:
 */
public abstract  class Duck implements FlyBehavior, QuackBehavior {
    /**
     * 多用组合，少用继承，增加代码灵活性
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    /**
     * 无参构造器，也可以称之为默认构造器
     */
    public Duck(){}

    /**
     * 将方法用 abstract 修饰，强制导出类必须覆盖此方法
     */
    public abstract void display();

    /**
     * 通用执行方法，只要是 FlyBehavior 的实现类，都可以调用此方法
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 通用执行方法，只要是 QuackBehavior 的实现类，都可以调用此方法
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All duck float, even decoys!");
    }
}
