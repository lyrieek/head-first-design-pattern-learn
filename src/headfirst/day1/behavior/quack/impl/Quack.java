package headfirst.day1.behavior.quack.impl;

import headfirst.day1.behavior.QuackBehavior;

/**
 * Created by thunder on 2017/3/30.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("真的在呱呱叫");
    }
}
