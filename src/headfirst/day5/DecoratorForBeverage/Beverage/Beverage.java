package headfirst.day5.DecoratorForBeverage.Beverage;

/**
 * 超类 -- 饮料
 */
public abstract class Beverage {
    String decription = "Unkown Beverage";

    public abstract double cost();

    public String getDecription() {
        return decription;
    }
}
