package headfirst.day1.behavior.quack.impl;

import headfirst.day1.behavior.QuackBehavior;

/**
 * Created by thunder on 2017/3/30.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不出声");
    }
}
