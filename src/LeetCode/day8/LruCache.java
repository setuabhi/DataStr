package LeetCode.day8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LruCache {
    Map<Integer, String> hm;
    Queue<Integer> queue;
    int capacity;

    public LruCache(int capacity) {
        this.capacity = capacity;
        this.hm = new HashMap<>();
        this.queue = new LinkedList<>();
    }

    public void add(Integer key, String value) {
        System.out.println("Added Key and value to cache: " + key + " " + value);
        if (hm.containsKey(key)) {
            // move this key to the end (most recently added)
            queue.remove(key);
        }
        // if full, remove least recently used
        else if (queue.size() == capacity) {
            int oldest = queue.poll();
            System.out.println("Removed Least used or last added: " + oldest);
            hm.remove(oldest);
        }
        queue.add(key);
        hm.put(key, value);
        System.out.println("Current Queue: "+ queue);
    }

    public String get(Integer key) {
        if (!hm.containsKey(key)) return null;
        System.out.println("Got data from Cache: " + hm.get(key));
        // move this key to the end (most recently used)
        queue.remove(key);
        queue.offer(key);
        return hm.get(key);
    }

    public static void main(String[] args) {
        LruCache cache = new LruCache(3);
        cache.add(1, "one");
        cache.add(2, "two");
        cache.add(3, "three");
        cache.get(3);
        cache.get(1);
        cache.add(1, "Four");
    }
}
