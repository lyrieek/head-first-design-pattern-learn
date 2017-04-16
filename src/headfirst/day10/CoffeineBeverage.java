package headfirst.day10;

/**
 * 咖啡和茶的抽象类
 */
public abstract class CoffeineBeverage {

    public static void main(String[] args) {
        CoffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CoffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

    }

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourIngup();
        if (customerOrder()) {
            addCondiments();
        }
    }

    public boolean customerOrder() {
        return true;
    }

    public void pourIngup() {
        System.out.println("pouring into cup");
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    public void boilWater() {
        System.out.println("boiling water");
    }
}
