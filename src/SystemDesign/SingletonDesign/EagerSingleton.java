package SystemDesign.SingletonDesign;

/**
 * Class instance will be created when application start running
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // Private constructor prevents instantiation
    private EagerSingleton() {}

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}

