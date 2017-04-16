package headfirst.day11;

import headfirst.day11.menu.Menu;
import headfirst.day11.menu.MenuComponent;
import headfirst.day11.menu.MenuItem;

import java.util.Iterator;

/**
 * Created by thunder on 2017/4/16.
 */
public class Waitress {

    MenuComponent allMenus;


    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PancakeHouseMenu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DinnerMenu", "Dinner");
        MenuComponent coffeeMenu = new Menu("CoffeeMenu", "Coffee");
        MenuComponent desserMenu = new Menu("DesserMenu", "Desser of course!");
        MenuComponent allMenu = new Menu("AllMenu", "All of menu!");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinnerMenu);
        allMenu.add(coffeeMenu);

        dinnerMenu.add(new MenuItem("pasata", "desciption", true, 3.89d));
        dinnerMenu.add(new MenuItem("pasata", "desciption", true, 3.89d));
        dinnerMenu.add(desserMenu);

        desserMenu.add(new MenuItem("Apple", "description", false, 3.33d));
        desserMenu.add(new MenuItem("Apple", "description", false, 3.33d));

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVegetarianMenu\n--------------");

        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) {

            }
        }
    }
}

