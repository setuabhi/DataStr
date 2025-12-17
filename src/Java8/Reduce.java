package Java8;

import java.util.Arrays;
import java.util.OptionalInt;

public class Reduce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        //Product of numbers using identity ( always return a value )
        int product = Arrays.stream(arr).reduce(1, (a, b) -> a * b);

        //Product of numbers without identity (doesn't always return a value )
        Integer productOptional = Arrays.stream(arr).reduce((a, b) -> a * b).orElse(0);
        System.out.println(productOptional);
    }
}
