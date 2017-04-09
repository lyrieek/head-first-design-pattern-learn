package headfirst.day6.factory;

import headfirst.day6.abstracts.factory.ChicagoPizzaFactory;
import headfirst.day6.abstracts.factory.NYPizzaFactory;
import headfirst.day6.pizza.Pizza;

/**
 * Pizza总店
 */
public abstract class PizzaStore {

    public static void main(String[] args) {
        /**
         * 这里初始化的是工厂并传入对应的调料工厂
         */
        PizzaStore nyPizzaStore = new NYPizzaStory(new NYPizzaFactory());
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStory(new ChicagoPizzaFactory());

        Pizza nyPizza = nyPizzaStore.orderPizza("pepperoni");
        System.out.println(nyPizza + " is finish");

        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println(chicagoPizza + " is finish");
    }

    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
