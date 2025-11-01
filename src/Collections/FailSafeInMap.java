package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * changes may or may not be seen in iteration bcoz in hashmap there is no insertion order
 */
public class FailSafeInMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) { // hasNext() just check whether iterator.next() has data or not
            Map.Entry<Integer, String> entry = iterator.next(); //.next() will point to first element for the first loop, then second element
            System.out.println(entry.getKey() + " " + entry.getKey());
            map.put(4, "Date");  // No exception, changes may or may not be seen in iteration, will throw java.util.ConcurrentModificationException if hashmap used
        }
        System.out.println(map);
    }
}
