package headfirst.day9.FacadePattern;

/**
 * Created by thunder on 2017/4/13.
 */
public class DVD {
    String movie;

    void on() {
        System.out.println("open DVD");
    }

    void play(String movie) {
        this.movie = movie;
        System.out.println(movie);
    }

    void off() {
        System.out.println(movie + " is shutdown");
    }
}
