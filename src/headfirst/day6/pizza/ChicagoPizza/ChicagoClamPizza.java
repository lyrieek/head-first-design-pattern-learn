package headfirst.day6.pizza.ChicagoPizza;

import headfirst.day6.abstracts.factory.ChicagoPizzaFactory;
import headfirst.day6.pizza.ClamPizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class ChicagoClamPizza extends ClamPizza {
    public ChicagoClamPizza(ChicagoPizzaFactory chicagoPizzaFactory) {
        this.name = "ChicagoClamPizza";
        this.sauce = chicagoPizzaFactory.createSauce();
    }

    public void prepare() {
        System.out.println("prepare " + name + "-" + sauce + " start");
    }
}
