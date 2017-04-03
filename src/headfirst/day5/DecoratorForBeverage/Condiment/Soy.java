package headfirst.day5.DecoratorForBeverage.Condiment;

import headfirst.day5.DecoratorForBeverage.Beverage.Beverage;

/**
 * 调味品--豆奶
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.50 + beverage.cost();
    }

    @Override
    public String getDecription() {
        return beverage.getDecription() + " and Soy ";
    }
}
