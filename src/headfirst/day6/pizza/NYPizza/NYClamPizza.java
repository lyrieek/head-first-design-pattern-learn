package headfirst.day6.pizza.NYPizza;

import headfirst.day6.abstracts.factory.NYPizzaFactory;
import headfirst.day6.pizza.ClamPizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class NYClamPizza extends ClamPizza {
    public NYClamPizza(NYPizzaFactory nyPizzaFactory) {
        this.name = "NYClamPizza";
        this.vinegar = nyPizzaFactory.createVinegar();
    }

    public void prepare() {
        System.out.println("prepare " + name + "-" + vinegar + " start");
    }
}
