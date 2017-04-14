package headfirst.day9.FacadePattern;

/**
 * Created by thunder on 2017/4/13.
 */
public class Projector {
    DVD dvd;

    void on() {
        System.out.println("open projector");
    }

    void setInput(DVD dvd) {
        this.dvd = dvd;
        System.out.println("set dvd");
    }

    void wideScreemMode() {
        System.out.println("set wide screen mode");
    }

    void off() {
        System.out.println("Projector is shutdown");
    }
}
