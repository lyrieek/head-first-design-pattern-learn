package headfirst.day6.abstracts.factory;

import headfirst.day6.abstracts.factory.ingredient.Sauce;
import headfirst.day6.abstracts.factory.ingredient.Vinegar;

/**
 * pizza原料抽象工厂
 */
public interface PizzaIngredientFactory {
    /**
     * 工厂生产酱油
     *
     * @return
     */
    Sauce createSauce();

    /**
     * 工厂生产醋
     *
     * @return
     */
    Vinegar createVinegar();
}
