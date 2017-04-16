package headfirst.day11;

import java.util.Iterator;

/**
 * Created by thunder on 2017/4/16.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
