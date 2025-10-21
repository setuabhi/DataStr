package SystemDesign.SingletonDesign;

/**
 * Class instance will be created when it's required
 */
public class Lazy {
    private static Lazy instance;

    // Private constructor prevents instantiation
    private Lazy() {
    }

    // Synchronized method ensures thread safety
    public static synchronized Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
