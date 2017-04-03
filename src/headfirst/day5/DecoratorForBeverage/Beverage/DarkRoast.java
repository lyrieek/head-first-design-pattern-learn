package headfirst.day5.DecoratorForBeverage.Beverage;

/**
 * Created by thunder on 2017/4/3.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.decription = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
