package SystemDesign.SingletonDesign;

public class Main {
    public static void main(String[] args) {
        CacheManagerUsingSingleton cache = CacheManagerUsingSingleton.getInstance();

        // Store data in cache
        cache.put("user_1", "John Doe");
        cache.put("user_2", "Jane Smith");

        // Retrieve data from cache
        System.out.println(cache.get("user_1")); // Output: John Doe
        System.out.println(cache.get("user_2")); // Output: Jane Smith
    }
}
