package headfirst.day11.menu;

import headfirst.day11.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by thunder on 2017/4/16.
 */
public class Menu extends MenuComponent {

    public Iterator createIterator() {
        return new CompositeIterator(components.iterator());
    }

    public void print() {
        System.out.print(getName() + ", ");
        System.out.println(getDescription());
        System.out.println("——————————");

        Iterator iterator = components.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            component.print();
        }
    }

    public void add(MenuComponent component) {
        components.add(component);
    }

    public void remove(MenuComponent component) {
        components.remove(component);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent) components.get(i);
    }

    String name;
    String description;
    ArrayList components = new ArrayList();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
