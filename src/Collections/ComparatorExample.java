package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * The Comparator interface is used when we want to define multiple custom sorting orders outside the class.
 */
public class ComparatorExample {
    int id;
    String name;

    public ComparatorExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        List<ComparatorExample> students = new ArrayList<>();
        students.add(new ComparatorExample(3, "Alice"));
        students.add(new ComparatorExample(1, "Bob"));
        students.add(new ComparatorExample(2, "Charlie"));
        students.add(new ComparatorExample(1, "Adam"));

        // Sort using Comparator: first by id, then by name
        students.sort(Comparator.comparingInt(ComparatorExample::getId).thenComparing(ComparatorExample::getName));
        System.out.println(students);

        int[][] intervals = {{2, 6},
                {8, 10},
                {1, 3},
                {13, 15},
                {9, 18}};
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])
        );
        System.out.println(Arrays.deepToString(intervals));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}


