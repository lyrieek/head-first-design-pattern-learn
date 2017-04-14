package headfirst.day9.impl;

import headfirst.day9.Duck;

/**
 * Created by thunder on 2017/4/13.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am fly");
    }
}
