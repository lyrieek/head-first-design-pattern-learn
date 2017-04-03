package headfirst.day5.DecoratorForBeverage.Condiment;

import headfirst.day5.DecoratorForBeverage.Beverage.Beverage;

/**
 * 调味品 装饰者的超类
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 装饰者必须重新实现getDescription方法！
     *
     * @return
     */
    public abstract String getDecription();
}
