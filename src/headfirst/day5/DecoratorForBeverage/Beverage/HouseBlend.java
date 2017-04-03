package headfirst.day5.DecoratorForBeverage.Beverage;

/**
 * 另一种饮料
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        super.decription = "House Blend Coffer";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
