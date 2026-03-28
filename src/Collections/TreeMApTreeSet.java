package Collections;

import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMApTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(6);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(2,2);
        treeMap.put(1,1);
        treeMap.put(9,9);
        treeMap.put(6,6);
        System.out.println(treeMap.firstEntry().getKey());
        System.out.println(treeMap.lastEntry().getKey());
        System.out.println(treeMap.pollFirstEntry().getKey());
        System.out.println(treeMap.pollLastEntry().getKey());
    }
}
