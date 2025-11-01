package Java8;

import Collections.ComparatorExample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeStream {
    public static void main(String[] args) {
        //return a list of even numbers greater than 10.
        List<Integer> numbers = Arrays.asList(5, 12, 15, 20, 8, 30);
        List<Integer> output = numbers.stream().filter(a -> a > 10).filter(a -> a % 2 == 0).toList();

        //convert all names to uppercase and first 3 characters only and return a new list.
        List<String> names = Arrays.asList("Abhinav", "Riya", "Siddharth");
        List<String> output2 = names.stream().map(a -> a.toUpperCase()).map(a -> a.substring(1, 3)).toList();


        //Find the sum of all numbers in a list using streams.
        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40);
        Integer sum = numbers2.stream().reduce(0, (a, b) -> a + b);

        // sort them first by id desc and then by name.
        List<ComparatorExample> students = new ArrayList<>();
        students.add(new ComparatorExample(3, "Alice"));
        students.add(new ComparatorExample(1, "Bob"));
        students.add(new ComparatorExample(2, "Charlie"));
        students.add(new ComparatorExample(1, "Adam"));
        List<ComparatorExample> studentsSorted = students.stream().sorted(
                Comparator.comparing(ComparatorExample::getId, Collections.reverseOrder()).thenComparing(ComparatorExample::getName)
        ).toList();

        //Group a list of words by their length and count how many words are in each group.
        List<String> words = Arrays.asList("java", "spring", "code", "stream", "map");
        Map<Integer, List<String>> groupBysize = words.stream().collect(Collectors.groupingBy(a -> a.length()));
        Map<Boolean, List<String>> partitionBy = words.stream().collect(Collectors.partitioningBy(a -> a.length() > 4));


        //From a list of numbers, get the first 3 distinct numbers greater than 10.
        List<Integer> numbers1 = Arrays.asList(5, 12, 12, 20, 30, 20, 25);
        List<Integer> first3GreaterThan10 = numbers1.stream().distinct().filter(a -> a > 10).limit(3).toList();


        //Expected Output: [1, 2, 3, 4, 5]
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );
        List<Integer> ll = listOfLists.stream().flatMap(a -> a.stream()).toList();

        //Find the first even number in a list; if none exist, return -1.
        List<Integer> numbers4 = Arrays.asList(1, 3, 5, 7, 9);
        int outputFirstEven = numbers4.stream().filter(a -> a % 2 == 0).findFirst().orElse(-1);
        System.out.println();

        //Find 3rd highest Number, if not present return -1
        List<Integer> numbers5 = Arrays.asList(1, 3, 5, 7, 9, 9, 9);
        Integer thirdHighest = numbers5.stream().distinct().sorted(Collections.reverseOrder()).
                skip(2).findFirst().orElse(-1);

        //Print all numbers greater than 10 while processing them in a stream.
        List<Integer> numbersPeek = Arrays.asList(5, 12, 15, 8, 20);
        numbersPeek.stream().peek(a -> System.out.println(a)).toList(); //peek wont work without terminal

        //Compute the sum of a large list of integers using a parallel stream.
        List<Integer> numbersLarge = IntStream.rangeClosed(1, 1000).boxed().toList();
        int outPut = numbersLarge.parallelStream().reduce(0, (a, b) -> a + b);
        System.out.println(outPut);

    }
}
