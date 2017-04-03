package headfirst.day5.DecoratorForBeverage.Condiment;

import headfirst.day5.DecoratorForBeverage.Beverage.Beverage;

/**
 * 调味品 -- 奶泡
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDecription() {
        return beverage.getDecription() + " and Whip ";
    }
}
