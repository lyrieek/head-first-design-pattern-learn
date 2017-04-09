package headfirst.day6.pizza.NYPizza;

import headfirst.day6.abstracts.factory.NYPizzaFactory;
import headfirst.day6.pizza.PepperoniPizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class NYPepperoniPizza extends PepperoniPizza {
    public NYPepperoniPizza(NYPizzaFactory nyPizzaFactory) {
        this.name = "NYPepperoniPizza";
        this.sauce = nyPizzaFactory.createSauce();
        this.vinegar = nyPizzaFactory.createVinegar();
    }

    public void prepare() {
        System.out.println("prepare " + name + "-" + sauce + "-" + vinegar + " start");
    }
}
