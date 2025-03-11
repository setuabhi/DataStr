package JavMemory;

import miscellaneous.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "USA"),
                new Employee("Jane", "USA"),
                new Employee("Abhinav", "USA"),
                new Employee("Ankit", "USA"),
                new Employee("Jack", "UK"),
                new Employee("Kancani", "UTTAR P"),
                new Employee("Jayanjana", "Bengal"),
                new Employee("Emily", "France")
        );

        Map<Boolean, List<List<Employee>>> ss=employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge))
                .values()
                .stream()
                .collect(Collectors.partitioningBy(chunk -> chunk.size() == 1));
        System.out.println("Hi");


    }
}
