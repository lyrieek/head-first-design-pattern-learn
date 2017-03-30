package headfirst.day1.behavior.quack.impl;

import headfirst.day1.behavior.QuackBehavior;

/**
 * Created by thunder on 2017/3/30.
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭，吱吱叫");
    }
}
