package SystemDesign.SingletonDesign;

import java.util.HashMap;
import java.util.Map;

public class CacheManagerUsingSingleton {
    //volatile variable is always read from and written to main memory, not from thread-specific caches. This means changes made by one thread to a volatile variable are visible to other threads immediately, race condition can occur as it's not thread safe, Atomic is thread safe
    private static volatile CacheManagerUsingSingleton instance;
    private final Map<String, String> cacheData;

    // Private constructor
    private CacheManagerUsingSingleton() {
        cacheData = new HashMap<>(); // this will be called only once throughout app life cycle
    }

    public static CacheManagerUsingSingleton getInstance() {
        if (instance == null) {
            synchronized (CacheManagerUsingSingleton.class) { // Line 19 will be accessed by only one thread at a time, synchronized block is better because if instance is created we don't want to make wait other threads
                instance = new CacheManagerUsingSingleton();

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
