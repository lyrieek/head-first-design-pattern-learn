package headfirst.day6.factory;

import headfirst.day6.abstracts.factory.NYPizzaFactory;
import headfirst.day6.pizza.NYPizza.NYCheesePizza;
import headfirst.day6.pizza.NYPizza.NYClamPizza;
import headfirst.day6.pizza.NYPizza.NYPepperoniPizza;
import headfirst.day6.pizza.NYPizza.NYVegglePizza;
import headfirst.day6.pizza.Pizza;

/**
 * Created by thunder on 2017/4/8.
 */
public class NYPizzaStory extends PizzaStore {
    NYPizzaFactory nyPizzaFactory;

    public NYPizzaStory(NYPizzaFactory nyPizzaFactory) {
        this.nyPizzaFactory = nyPizzaFactory;
    }

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese"))
            pizza = new NYCheesePizza(nyPizzaFactory);
        else if (type.equals("pepperoni"))
            pizza = new NYPepperoniPizza(nyPizzaFactory);
        else if (type.equals("clam"))
            pizza = new NYClamPizza(nyPizzaFactory);
        else if (type.equals("veggle"))
            pizza = new NYVegglePizza(nyPizzaFactory);
        return pizza;
    }
}
