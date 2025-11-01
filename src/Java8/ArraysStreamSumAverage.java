package Java8;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArraysStreamSumAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Integer[] arrNonPrimitive = {1, 2, 3, 4, 5, 6};

//Sum of sq of all even number
        int sumOfSquareOfEvenNumbers = Arrays.stream(arr).
                filter(a -> a % 2 == 0).map(a -> a * a). //Intermediate
                        sum(); //Terminal
        int sumOfSquareOfEvenNumbersNonPrimitive = Arrays.stream(arrNonPrimitive).
                mapToInt(Integer::intValue). //Intermediate
                filter(a -> a % 2 == 0).map(a -> a * a). //Intermediate
                        sum(); //Terminal
//Convert to list
        List<Integer> list = Arrays.stream(arr)  // returns IntStream (primitive int)
                .boxed()   // converts to Stream<Integer>
                .toList(); // collect to List<Integer>

        List<Integer> list1 = Arrays.stream(arrNonPrimitive)  // returns Stream<Integer>
                .toList(); // collect to List<Integer> //No need of boxed

        //Average of odd number
        Double average = Arrays.stream(arr).
                filter(a -> a % 2 != 0). //Intermediate
                average().orElse(0.0); //Terminal
        Double averageNonPrimitive = Arrays.stream(arrNonPrimitive).
                mapToInt(Integer::intValue).filter(a -> a % 2 != 0).//Intermediate
                average().orElse(0.0);//Intermediate
        System.out.println(average); //Terminal


    }
}
