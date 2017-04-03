package headfirst.day5.DecoratorForBeverage.Beverage;

/**
 * 浓缩咖啡，继承饮料
 */
public class Espresso extends Beverage {
    public Espresso() {
        super.decription = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
