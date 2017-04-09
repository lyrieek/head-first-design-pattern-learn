package headfirst.day6.pizza.ChicagoPizza;

import headfirst.day6.abstracts.factory.ChicagoPizzaFactory;
import headfirst.day6.pizza.VegglePizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class ChicagoVegglePizza extends VegglePizza {
    public ChicagoVegglePizza(ChicagoPizzaFactory chicagoPizzaFactory) {
        this.name = "ChicagoVegglePizza";
        this.vinegar = chicagoPizzaFactory.createVinegar();
        this.sauce = chicagoPizzaFactory.createSauce();
    }

    public void prepare() {
        System.out.println("prepare " + name + "-" + sauce + "-" + vinegar + " start");
    }
}
