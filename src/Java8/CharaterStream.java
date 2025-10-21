package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CharaterStream {
    public static void main(String[] args) {
        // Primitive char array
        char[] arr = {'a', 'b', 'c'};

        // Non-primitive Character array
        Character[] arrNonPrimitive = {'a', 'b', 'c'};

        // String
        String S = "Abhinav";

        // ✅ Works directly because Character[] is already an object array
        // Arrays.stream() gives Stream<Character>, so toList() works fine
        List<Character> list = Arrays.stream(arrNonPrimitive)
                .toList();

        // ❌ arr.chars() does NOT exist because arr is a char[]
        // ✅ Instead, use IntStream.range() to iterate over array indexes
        List<Character> list1 = IntStream.range(0, arr.length) // 0..arr.length-1
                .mapToObj(i -> arr[i]) // map index -> char
                .toList();

        // ✅ String.chars() exists and returns IntStream (Unicode code points)
        // Must cast each int to char
        List<Character> list2 = S.chars()
                .mapToObj(c -> (char) c)
                .toList();

        // Printing results
        System.out.println(list);   // [a, b, c]
        System.out.println(list1);  // [a, b, c]
        System.out.println(list2);  // [A, b, h, i, n, a, v]

    }
}
