package headfirst.day10;

/**
 * Created by thunder on 2017/4/16.
 */
public class Coffee extends CoffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Add sugar and mike");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public boolean customerOrder() {
        return false;
    }
}
