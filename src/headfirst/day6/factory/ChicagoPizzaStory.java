package headfirst.day6.factory;

import headfirst.day6.abstracts.factory.ChicagoPizzaFactory;
import headfirst.day6.pizza.ChicagoPizza.ChicagoCheesePizza;
import headfirst.day6.pizza.ChicagoPizza.ChicagoClamPizza;
import headfirst.day6.pizza.ChicagoPizza.ChicagoPepperoniPizza;
import headfirst.day6.pizza.ChicagoPizza.ChicagoVegglePizza;
import headfirst.day6.pizza.Pizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class ChicagoPizzaStory extends PizzaStore {
    ChicagoPizzaFactory chicagoPizzaFactory;

    public ChicagoPizzaStory(ChicagoPizzaFactory chicagoPizzaFactory) {
        this.chicagoPizzaFactory = chicagoPizzaFactory;
    }

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese"))
            pizza = new ChicagoCheesePizza(chicagoPizzaFactory);
        else if (type.equals("pepperoni"))
            pizza = new ChicagoPepperoniPizza(chicagoPizzaFactory);
        else if (type.equals("clam"))
            pizza = new ChicagoClamPizza(chicagoPizzaFactory);
        else if (type.equals("veggle"))
            pizza = new ChicagoVegglePizza(chicagoPizzaFactory);
        return pizza;
    }
}
