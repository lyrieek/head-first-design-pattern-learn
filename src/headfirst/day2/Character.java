package headfirst.day2;

import headfirst.day2.behavior.WeaponHehavior;
import headfirst.day2.behavior.impl.AxeBehavior;
import headfirst.day2.behavior.impl.BowAndArrowBehavior;
import headfirst.day2.behavior.impl.SwordBehavior;

/**
 * 人物对象
 */
public abstract class Character {
    WeaponHehavior weaponHehavior;

    /**
     * 人物的战斗行为
     */
    public abstract void fight();

    public void setWeaponHehavior(WeaponHehavior weaponHehavior) {
        this.weaponHehavior = weaponHehavior;
    }

}
