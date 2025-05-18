package Java8;


import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class ArraysStreamSumAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Integer[] arrNonPrimitive = {1, 2, 3, 4};
        Stream.of(arrNonPrimitive).forEach(System.out::println);

        //Sum of sq of all even number
        int sumOfSquareOfEvenNumbers = Arrays.stream(arr).
                filter(a -> a % 2 == 0).map(a -> a * a). //Intermediate
                        sum(); //Terminal
        System.out.println(sumOfSquareOfEvenNumbers);

        //Average of odd number
        Double average = Arrays.stream(arr).filter(a->a%2!=0).average().orElse(0.0);
        System.out.println(average);

    }
}
