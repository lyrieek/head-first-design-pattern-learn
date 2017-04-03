package headfirst.day5.DecoratorForBeverage.Condiment;

import headfirst.day5.DecoratorForBeverage.Beverage.Beverage;
import headfirst.day5.DecoratorForBeverage.Beverage.DarkRoast;
import headfirst.day5.DecoratorForBeverage.Beverage.Espresso;
import headfirst.day5.DecoratorForBeverage.Beverage.HouseBlend;

/**
 * 供应饮料--测试成果
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        /**
         * 订一杯Espresso，不加调味品
         */
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDecription() + " cost: " + espresso.cost());

        /**
         * 订一杯DarkRoast，用2个Moche，1个Whip装饰
         */
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);//用两个Moche装饰它
        darkRoast = new Whip(darkRoast);//用一个Whip装饰它
        System.out.println(darkRoast.getDecription() + " cost: " + darkRoast.cost());

        /**
         * 订一杯HouseBlend，用1个奶泡，1个豆奶，1个摩卡装饰
         */
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDecription() + " cost: " + houseBlend.cost());
    }
}
