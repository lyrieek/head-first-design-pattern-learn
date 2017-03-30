package headfirst.day1;

import headfirst.day1.behavior.fly.impl.FlyRocketPowered;

/**
 * Created by thunder on 2017/3/30.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
/*        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();*/

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
