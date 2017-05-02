package headfirst.day7;

/**
 * Created by thunder on 2017/5/2.
 */
public class BetterSingle {
    private BetterSingle() {
    }

    private static class HolderClass {
        private final static BetterSingle instance = new BetterSingle();
    }

    public static BetterSingle getInstance() {
        return HolderClass.instance;
    }
}
