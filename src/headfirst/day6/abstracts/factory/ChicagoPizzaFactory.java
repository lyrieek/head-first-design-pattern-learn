package headfirst.day6.abstracts.factory;

import headfirst.day6.abstracts.factory.ingredient.ChicagoSauce;
import headfirst.day6.abstracts.factory.ingredient.ChicagoVinegar;
import headfirst.day6.abstracts.factory.ingredient.Sauce;
import headfirst.day6.abstracts.factory.ingredient.Vinegar;

/**
 * Created by thunder on 2017/4/8.
 */
public class ChicagoPizzaFactory implements PizzaIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    @Override
    public Vinegar createVinegar() {
        return new ChicagoVinegar();
    }
}
