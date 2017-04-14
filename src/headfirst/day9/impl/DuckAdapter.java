package headfirst.day9.impl;

import headfirst.day9.Duck;
import headfirst.day9.Turkey;

/**
 * 让鸭子模拟火鸡的适配器
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
