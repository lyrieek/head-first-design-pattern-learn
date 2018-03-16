package headfirst.day7;

/**
 * 饱汉模式
 */
public class SingleTon1 {
    private static final SingleTon1 singleTon1 = new SingleTon1();

    private SingleTon1() {
    }

    public static SingleTon1 getInstance() {
        return singleTon1;
    }

}
