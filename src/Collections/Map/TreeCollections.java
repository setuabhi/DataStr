package Collections.Map;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeCollections {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.pollFirstEntry();
        tm.pollLastEntry();
        tm.firstEntry();
        tm.lastEntry();

        TreeSet<String> ts = new TreeSet<>();
        ts.pollFirst();
        ts.pollLast();
        ts.getFirst();
        ts.getLast();

        tm.forEach((key, value) -> {
            System.out.println(key+ value);
        });
    }
}