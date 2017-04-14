package headfirst.day9.FacadePattern;

/**
 * Created by thunder on 2017/4/13.
 */
public class Popper {
    void on() {
        System.out.println("open popper");
    }

    void pop() {
        System.out.println("begin popper");
    }

    void off() {
        System.out.println("Popper is shutdown");
    }
}
