package headfirst.day2;

import headfirst.day2.behavior.impl.AxeBehavior;

/**
 * 骑士
 */
public class Knight extends Character{
    public Knight() {
        this.weaponHehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        this.weaponHehavior.useWeapon();
    }
}
