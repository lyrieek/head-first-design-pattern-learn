package headfirst.day2;

import headfirst.day2.behavior.impl.BowAndArrowBehavior;

/**
 * 女王
 */
public class Queen extends Character{
    public Queen() {
        this.weaponHehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        this.weaponHehavior.useWeapon();
    }
}
