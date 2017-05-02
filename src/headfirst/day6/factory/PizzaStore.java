package headfirst.day6.factory;

import headfirst.day6.XMLUtil;
import headfirst.day6.pizza.Pizza;

/**
 * Pizza总店
 */
public abstract class PizzaStore {

    public static void main(String[] args) {
/*        PizzaStore nyPizzaStore = new NYPizzaStory(new NYPizzaFactory());
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStory(new ChicagoPizzaFactory());*/
        /**
         * 使用读取xml的形式实例化Store和Factory对象
         */
        NYPizzaStory nyPizzaStore = (NYPizzaStory) XMLUtil.getBean("NYPizza");
        ChicagoPizzaStory chicagoPizzaStore = (ChicagoPizzaStory) XMLUtil.getBean("ChicagoPizza");

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
