package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<List<String>> arrL= new ArrayList<>();
        arrL.add(Arrays.asList("abhi", "sri"));
        arrL.add(Arrays.asList("pramod", "das"));
        arrL.add(Arrays.asList("sonali", "kumari"));

        List<String> flateningExample = arrL.stream().flatMap(a->a.stream()).map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(flateningExample);
    }
}
