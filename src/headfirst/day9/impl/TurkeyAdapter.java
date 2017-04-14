package headfirst.day9.impl;

import headfirst.day9.Duck;
import headfirst.day9.Turkey;

/**
 * 让火鸡模拟鸭子的适配器
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
