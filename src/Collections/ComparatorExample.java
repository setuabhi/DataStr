package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
        List<ComparatorExample> students = new ArrayList<>(); // ✅ generic type
        students.add(new ComparatorExample(3, "Alice"));
        students.add(new ComparatorExample(1, "Bob"));
        students.add(new ComparatorExample(2, "Charlie"));
        students.add(new ComparatorExample(1, "Adam"));

        students.sort(Comparator.comparingInt((ComparatorExample a)-> a.getId())
                .thenComparing(a->a.getName())); // type cast needed in java 21


        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "Dave");
        // Sort the list using a lambda expression
        names.sort(Comparator.comparing(a->a));

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
    }

}


