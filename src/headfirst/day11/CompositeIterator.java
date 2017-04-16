package headfirst.day11;

import headfirst.day11.menu.Menu;
import headfirst.day11.menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by thunder on 2017/4/16.
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty())
            return false;
        else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else
                return true;
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu)
                stack.push(component.createIterator());
            return component;
        } else
            return null;
    }
}
