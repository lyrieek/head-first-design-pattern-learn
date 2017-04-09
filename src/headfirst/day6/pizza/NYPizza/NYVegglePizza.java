package headfirst.day6.pizza.NYPizza;

import headfirst.day6.abstracts.factory.NYPizzaFactory;
import headfirst.day6.pizza.VegglePizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class NYVegglePizza extends VegglePizza {
    public NYVegglePizza(NYPizzaFactory nyPizzaFactory) {
        this.name = "NYVegglePizza";
        this.sauce = nyPizzaFactory.createSauce();
    }

    public void prepare() {
        System.out.println("prepare " + name + "-" + sauce + " start");
    }
}
