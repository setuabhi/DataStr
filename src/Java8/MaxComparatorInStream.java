package Java8;

import JavMemory.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxComparatorInStream {
    public static void main(String[] args) {
        List<Employee> arrL = List.of(
                new Employee("John", "USA"),
                new Employee("Jane", "USA"),
                new Employee("Abhinav", "USA"),
                new Employee("Ankit", "USA"),
                new Employee("Jack", "UK"),
                new Employee("Kancani", "UTTAR P"),
                new Employee("Jayanjana", "Bengal"),
                new Employee("Emily", "France")
        );
        List<String> arrString = new ArrayList<>();
        arrString.add("Test");
        arrString.add("Test2");

        Optional<Employee> output = arrL.stream()
                .max(Comparator.comparingInt((Employee employee) -> employee.getName().length())
                        .thenComparingInt((Employee employee) -> employee.getAge().length()));

        Optional<Employee> outputReverse = arrL.stream().
                max((e1, e2) -> Integer.compare(e2.getName().length(), e1.getName().length()));

        Optional<String> outputString = arrString.stream().
                max(Comparator.comparingInt(String::length)); //method reference can be used

        System.out.println(output.get());
    }
}
