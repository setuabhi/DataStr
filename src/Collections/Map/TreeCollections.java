package Collections.Map;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeCollections {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.firstKey();
        tm.firstEntry();
        TreeSet<String> ts = new TreeSet<>();
        ts.first();
        ts.last();

        tm.forEach((key, value) -> {
            System.out.println(key + value);
        });
    }
}