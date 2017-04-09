package headfirst.day6.pizza;

import headfirst.day6.abstracts.factory.ingredient.Sauce;
import headfirst.day6.abstracts.factory.ingredient.Vinegar;

/**
 * Pizza类型的特性
 */
public abstract class Pizza {
    public String name;

    public Sauce sauce;

    public Vinegar vinegar;

    public String toString() {
        return "name: " + name + "--sauce: " + sauce + "--vinegar: " + vinegar;
    }

    /**
     * 准备
     */
    public void prepare() {
        System.out.println("prepare " + name + " start");
    }

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println("bake pizza");
    }

    /**
     * 切片
     */
    public void cut() {
        System.out.println("cut pizza");
    }

    /**
     * 装盒
     */
    public void box() {
        System.out.println("box " + this.name + " is OK!");
    }
}
