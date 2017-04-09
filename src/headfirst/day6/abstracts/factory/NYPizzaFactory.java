package headfirst.day6.abstracts.factory;

import headfirst.day6.abstracts.factory.ingredient.NYSauce;
import headfirst.day6.abstracts.factory.ingredient.NYVinegar;
import headfirst.day6.abstracts.factory.ingredient.Sauce;
import headfirst.day6.abstracts.factory.ingredient.Vinegar;

/**
 * Created by thunder on 2017/4/9.
 */
public class NYPizzaFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Vinegar createVinegar() {
        return new NYVinegar();
    }
}
