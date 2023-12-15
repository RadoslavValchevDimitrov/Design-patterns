package Singleton;

public class DoubleCheckLocking {

    private volatile static DoubleCheckLocking singleton = null;

    private int data = 0;

    private DoubleCheckLocking() {

    }

    public static DoubleCheckLocking getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckLocking.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLocking();
                }
            }

        }
        return singleton;
    }
}

