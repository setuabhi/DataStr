package LeetCode.day8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LruUsingLinked {
    int capacity;
    LinkedHashMap<Integer, String> linkedHashMap;

    LruUsingLinked(int capacity) {
        this.capacity = capacity;
        linkedHashMap = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    void put(int key,String value)
    {
        if(linkedHashMap.size()==capacity)
        {
            Iterator<Map.Entry<Integer,String>> iterator = linkedHashMap.entrySet().iterator();
            linkedHashMap.remove(iterator.next().getKey());
        }
        linkedHashMap.put(key,value);
    }
    String get(int key)
    {
        return linkedHashMap.get(key);
    }

    public static void main(String[] args) {
        LruUsingLinked lruUsingLinked = new LruUsingLinked(3);
        lruUsingLinked.put(1,"one");
        lruUsingLinked.put(2,"two");
        lruUsingLinked.put(3,"three");
        System.out.println(lruUsingLinked.get(2));
        System.out.println(lruUsingLinked.get(1));
        lruUsingLinked.put(4,"four");
        System.out.println("HI");
    }
}
