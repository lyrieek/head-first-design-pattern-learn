package headfirst.day6.pizza.NYPizza;

import headfirst.day6.abstracts.factory.NYPizzaFactory;
import headfirst.day6.pizza.CheesePizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class NYCheesePizza extends CheesePizza {
    public NYCheesePizza(NYPizzaFactory nyPizzaFactory) {
        this.name = "NYCheesePizza";
        this.sauce = nyPizzaFactory.createSauce();
    }

    public void prepare() {
        System.out.println("prepare " + name + "-" + sauce + " start");
    }
}
