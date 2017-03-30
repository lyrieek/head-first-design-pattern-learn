package headfirst.day1;

import headfirst.day1.behavior.FlyBehavior;
import headfirst.day1.behavior.QuackBehavior;

/**
 * head first design patterns 第一章 ：设计模式入门
 */
public abstract class Duck {
    /**
     * 飞行行为
     */
    FlyBehavior flyBehavior;

    /**
     * 鸭子叫的行为
     */
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim()
    {
        System.out.println("All duck float,even decoys");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
