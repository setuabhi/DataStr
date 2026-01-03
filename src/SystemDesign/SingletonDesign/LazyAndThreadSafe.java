package SystemDesign.SingletonDesign;

/**
 * Class instance will be created when it's required
 */
public class LazyAndThreadSafe {
    private static volatile LazyAndThreadSafe instance;

    // Private constructor prevents instantiation
    private LazyAndThreadSafe() {
    }

    // Synchronized method ensures thread safety
    public static synchronized LazyAndThreadSafe getInstance() {
        if (instance == null) {
            synchronized (LazyAndThreadSafe.class) { // Line 17 will be accessed by only one thread at a time
                instance = new LazyAndThreadSafe();

            }
        }
        return instance;
    }
}
