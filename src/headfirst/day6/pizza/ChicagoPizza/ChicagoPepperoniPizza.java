package headfirst.day6.pizza.ChicagoPizza;

import headfirst.day6.abstracts.factory.ChicagoPizzaFactory;
import headfirst.day6.pizza.PepperoniPizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class ChicagoPepperoniPizza extends PepperoniPizza {
    public ChicagoPepperoniPizza(ChicagoPizzaFactory chicagoPizzaFactory) {
        this.name = "ChicagoPepperoniPizza";
        this.vinegar = chicagoPizzaFactory.createVinegar();
    }

    public void prepare() {
        System.out.println("prepare " + name + "-" + vinegar + " start");
    }
}
