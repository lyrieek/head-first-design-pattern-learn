package headfirst.day9;

import headfirst.day9.impl.MallardDuck;
import headfirst.day9.impl.TurkeyAdapter;
import headfirst.day9.impl.WildTurkey;

/**
 * Created by thunder on 2017/4/13.
 */
public class TestClass {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);//把火鸡放入火鸡适配器假装是个鸭子

        System.out.println("Turkey say:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck say:");
        testDuck(duck);

        System.out.println("\nTurkey use Adapter say:");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
