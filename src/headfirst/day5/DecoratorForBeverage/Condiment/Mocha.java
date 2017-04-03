package headfirst.day5.DecoratorForBeverage.Condiment;

import headfirst.day5.DecoratorForBeverage.Beverage.Beverage;

/**
 * 调味品 --摩卡
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDecription() {
        return beverage.getDecription() + " and Mocha ";
    }
}
