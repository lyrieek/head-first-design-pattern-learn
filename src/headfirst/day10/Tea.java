package headfirst.day10;

/**
 * Created by thunder on 2017/4/16.
 */
public class Tea extends CoffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
