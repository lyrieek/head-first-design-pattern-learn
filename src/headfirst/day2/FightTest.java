package headfirst.day2;

import headfirst.day2.behavior.impl.AxeBehavior;

/**
 * Created by thunder on 2017/3/31.
 */
public class FightTest {
    public static void main(String[] args) {
        Character king = new King();

        king.fight();

        king.setWeaponHehavior(new AxeBehavior());

        king.fight();
    }
}
