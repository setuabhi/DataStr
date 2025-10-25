package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharaterStream {
    public static void main(String[] args) {
        // Primitive char array
      /*  char[] arr = {'a', 'b', 'c'};

        // Non-primitive Character array
        Character[] arrNonPrimitive = {'a', 'b', 'c'};

        // String
        String S = "Abhinav";

        // Arrays.stream() gives Stream<Character>, so toList() works fine
        List<Character> list = Arrays.stream(arrNonPrimitive)
                .toList();


        List<Character> list2 = S.chars()//Return IntStream
                .mapToObj(c -> (char) c) //converts to Stream<Character>
                .toList();

        List<Character> list1 = new String(arr).chars()//Return IntStream
                .mapToObj(c -> (char) c) //converts to Stream<Character>
                .collect(Collectors.toList());

        // Printing results
        System.out.println(list);   // [a, b, c]
        System.out.println(list1);  // [a, b, c]
        System.out.println(list2);  // [A, b, h, i, n, a, v]*/

        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "Dave");
        List<String> namesorted= names.stream().sorted(Comparator.comparing(a->a)).toList();
        System.out.println();
    }
}
