package Collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeCollections {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "AA");
        System.out.println(tm.firstKey());
        System.out.println(tm.firstEntry().getValue());
        System.out.println(tm.lastKey());
        System.out.println(tm.lastEntry().getValue());
        tm.pollFirstEntry();

        TreeSet<String> ts = new TreeSet<>();
        ts.add("AAA");
        System.out.println(ts.first());
        System.out.println(ts.last());
        ts.pollFirst();

    }
}