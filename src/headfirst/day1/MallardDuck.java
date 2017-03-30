package headfirst.day1;

import headfirst.day1.behavior.fly.impl.FlyWithWings;
import headfirst.day1.behavior.quack.impl.Quack;

/**
 * 会叫会飞的野生鸭子
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("i am a ready mallard duck");
    }
}
