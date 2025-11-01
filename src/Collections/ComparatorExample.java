package Collections;

import java.util.*;

/**
 * The Comparator interface is used when we want to define multiple custom sorting orders outside the class.
 */
public class ComparatorExample {
        private final int id;
        private final String name;

        public ComparatorExample(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "{" + id + ", " + name + "}";
        }

    public static void main(String[] args) {
        //Object sort
        List<ComparatorExample> students = new ArrayList<>(); // ✅ generic type
        students.add(new ComparatorExample(3, "Alice"));
        students.add(new ComparatorExample(1, "Bob"));
        students.add(new ComparatorExample(2, "Charlie"));
        students.add(new ComparatorExample(1, "Adam"));
        students.sort(Comparator.comparingInt((ComparatorExample a)-> a.getId())
                .thenComparing(a->a.getName())); // type cast needed in java 21

        //List sort
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "Dave");
        names.sort(Comparator.comparing(a->a)); // Sort the list using a lambda expression

        //Arrays sort
        int[][] intervals = {{2, 6},
                {8, 10},
                {1, 3},
                {13, 15},
                {9, 18}};
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])
        );
        int[] interval1D = {2, 6,0};
        Arrays.sort(interval1D);

        //Map sort
        HashMap<Integer,Integer> hm =new HashMap<>();
        hm.put(1,5);
        hm.put(2,0);
        hm.put(0,6);
        hm.put(4,2);
        ArrayList<Map.Entry<Integer,Integer>> arrayList = new ArrayList<>(hm.entrySet());
        arrayList.sort(Comparator.comparing(a->a.getValue(),Collections.reverseOrder()));
        arrayList.forEach(a->{
            System.out.println(a.getKey()+" "+a.getValue());
        });
    }

}


