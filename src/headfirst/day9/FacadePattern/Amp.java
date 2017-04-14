package headfirst.day9.FacadePattern;

/**
 * Created by thunder on 2017/4/13.
 */
public class Amp {
    DVD dvd;

    void on() {
        System.out.println("open amp");
    }

    void setDvd(DVD dvd) {
        this.dvd = dvd;
        System.out.println("set dvd");
    }

    void setSurroundSound() {
        System.out.println("set surround sound");
    }

    void setVolum(int volum) {
        System.out.println("set volum to " + volum);
    }

    void off() {
        System.out.println("Amp is shutdown");
    }
}
