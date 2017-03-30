package headfirst.day1;

import headfirst.day1.Duck;
import headfirst.day1.behavior.fly.impl.FlyNoWay;
import headfirst.day1.behavior.quack.impl.Quack;

/**
 * Created by thunder on 2017/3/30.
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override

    public void display() {
        System.out.println("i am a model duck");
    }
}
