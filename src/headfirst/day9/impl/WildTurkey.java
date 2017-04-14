package headfirst.day9.impl;

import headfirst.day9.Turkey;

/**
 * Created by thunder on 2017/4/13.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("Fly short distance");
    }
}
