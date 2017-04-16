package headfirst.day11.menu;

import headfirst.day11.NullIterator;

import java.util.Iterator;

/**
 * Created by thunder on 2017/4/16.
 */
public class MenuItem extends MenuComponent {

    public Iterator createIterator() {
        return new NullIterator();
    }

    public void print() {
        System.out.print(getName() + ", ");
        if (vegetarian)
            System.out.print("is Vegetarian , pay : ");
        System.out.print(getPrice() + "$ ");
        System.out.println(getDescription());
    }

    String name;
    String description;
    boolean vegetarian;
    double price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public MenuItem(String name, String description, boolean vegetarian, double price) {

        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
}
