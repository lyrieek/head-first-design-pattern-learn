package headfirst.day2;

import headfirst.day2.behavior.impl.AxeBehavior;

/**
 * 巨魔
 */
public class Troll extends Character{
    public Troll() {
        this.weaponHehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        this.weaponHehavior.useWeapon();
    }
}
