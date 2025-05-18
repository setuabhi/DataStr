package JavaEight;

import JavMemory.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestLenghtString {
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
        Optional<Employee> output= arrL.stream().max(Comparator.comparingInt(employee->employee.getName().length()));
        Optional<Employee> outputWithoutComparator= arrL.stream().max((e1,e2)->Integer.compare(e1.getName().length(),e2.getName().length()));
        Optional<Employee> outputReverse= arrL.stream().max((e1,e2)->Integer.compare(e2.getName().length(),e1.getName().length()));
        //Optional<String> output= arrL.stream().max(Comparator.comparingInt(String::length)); method reference can be used
        //Optional<String> outputWithoutComparator= arrL.stream().max(s1,s2->Integer.compare(s1.length,s2.length)); method reference can be used
        //Optional<String> outputReverse= arrL.stream().max(s1,s2->Integer.compare(s2.length,s1.length))); //method reference can be used
        System.out.println(output.get());
    }
}
