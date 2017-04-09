package headfirst.day6.pizza.ChicagoPizza;

import headfirst.day6.abstracts.factory.ChicagoPizzaFactory;
import headfirst.day6.pizza.CheesePizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class ChicagoCheesePizza extends CheesePizza {

    public ChicagoCheesePizza(ChicagoPizzaFactory chicagoPizzaFactory) {
        this.name = "ChicagoCheesePizza";
        this.sauce = chicagoPizzaFactory.createSauce();
        this.vinegar = chicagoPizzaFactory.createVinegar();
    }

    public void prepare() {
        System.out.println("prepare " + name + "-" + sauce + "-" + vinegar + " start");
    }
}
