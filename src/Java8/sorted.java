package Java8;

import JavMemory.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sorted {
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

        List<Employee> sorted= arrL.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();
        sorted.forEach(a-> System.out.println(a.getName()+" "+a.getAge()));

        List<Employee> sortedMutlple= arrL.stream()
                .sorted(Comparator.comparing( Employee::getName)
                        .thenComparing(Employee::getAge))
                .toList();
        sorted.forEach(a-> System.out.println(a.getName()+" "+a.getAge()));
        sortedMutlple.forEach(a-> System.out.println(a.getName()+" "+a.getAge()));
    }
}
