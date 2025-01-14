package SystemDesign.SingletonDesign;

import java.util.HashMap;
import java.util.Map;

public class ThreadSafeLazy {
    private static ThreadSafeLazy instance;
    private Map<String, String> cacheData;

    // Private constructor
    private ThreadSafeLazy() {
        cacheData = new HashMap<>();
    }

    // Double-checked locking for thread-safe Singleton
    public static ThreadSafeLazy getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazy.class) { // Line 19,20 will accessed by only one thread at a time
                if (instance == null) {
                    instance = new ThreadSafeLazy();
                }
            }
        }
        return instance;
    }

    // Add data to the cache
    public void put(String key, String value) {
        cacheData.put(key, value);
    }

    // Retrieve data from the cache
    public String get(String key) {
        return cacheData.get(key);
    }
}
