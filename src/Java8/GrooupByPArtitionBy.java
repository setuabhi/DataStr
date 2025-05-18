package Java8;

import JavMemory.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrooupByPArtitionBy
{
    public static void main(String[] args) {
        List<Employee> arrL = new ArrayList<>();

        Map<String,List<Employee>> employeeGroupedByAge = arrL.stream().
                collect(Collectors.groupingBy(e->e.getAge()));

        // true will be senior list and false will be junior List
        Map<Boolean,List<Employee>> seniorJunior = arrL.stream().
                collect(Collectors.partitioningBy(e->Integer.parseInt(e.getAge())>30));
    }
}
