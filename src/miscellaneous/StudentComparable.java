package miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Comparable interface is used when the natural ordering of objects is defined within the class itself.
 * The class implements the Comparable interface and overrides the compareTo method.
 */
public class StudentComparable implements Comparable<StudentComparable>{
        int id;
        String name;

    public StudentComparable( int id, String name){
        this.id = id;
        this.name = name;
    }

        @Override
        public int compareTo (StudentComparable other){
        return this.id - other.id; // Natural ordering by ID
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    }
    class ComparableExample {
        public static void main(String[] args) {
            List<StudentComparable> students = new ArrayList<>();
            students.add(new StudentComparable(3, "Alice"));
            students.add(new StudentComparable(1, "Bob"));
            students.add(new StudentComparable(2, "Charlie"));

            // Sort using Comparable (natural ordering)
            Collections.sort(students);

            System.out.println("Sorted by ID (Comparable): " + students);
        }
    }

