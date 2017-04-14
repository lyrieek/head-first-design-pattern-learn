package headfirst.day9.FacadePattern;

/**
 * Created by thunder on 2017/4/13.
 */
public class Light {
    void dim(int light) {
        System.out.println("put light " + light);
    }

    void off() {
        System.out.println("Light is shutdown");
    }
}
