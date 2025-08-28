package Java8;

import JavMemory.Employee;

import java.util.Comparator;
import java.util.List;

public class SortedComparatorInStream {
    public static void main(String[] args) {
        List<Employee> arrL = List.of(
                new Employee("John", "20"),
                new Employee("Jane", "20"),
                new Employee("Abhinav", "18"),
                new Employee("Abhinav", "11"),
                new Employee("Jack", "34"),
                new Employee("Kancani", "22"),
                new Employee("Jayanjana", "44"),
                new Employee("Emily", "36")
        );

        List<Employee> sorted = arrL.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();
        sorted.forEach(a -> System.out.println(a.getName() + " " + a.getAge()));

        List<Employee> sortedMutlple = arrL.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getAge))
                .toList();
        System.out.println(" ");
        sortedMutlple.forEach(a -> System.out.println(a.getName() + " " + a.getAge()));
    }
}
