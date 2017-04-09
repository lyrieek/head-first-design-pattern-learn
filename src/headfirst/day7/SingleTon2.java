package headfirst.day7;

/**
 * 检查并加锁
 */
public class SingleTon2 {
    private volatile static SingleTon2 singleTon2;

    private SingleTon2() {
    }

    public static SingleTon2 getInstance() {
        /**
         * 只有第一次需要加锁，防止并发
         */
        if (singleTon2 == null)
            synchronized (SingleTon2.class) {
                singleTon2 = new SingleTon2();
            }
        return singleTon2;
    }
}
