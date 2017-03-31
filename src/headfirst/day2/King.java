package headfirst.day2;

import headfirst.day2.behavior.impl.SwordBehavior;

/**
 * 国王
 */
public class King extends Character{

    public King() {
        this.weaponHehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        this.weaponHehavior.useWeapon();
    }
}
